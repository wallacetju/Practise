package Question25;
import LinkedList.*;
import java.util.ArrayList;
public class Question25
{
  private ArrayList<Node> markList;
  private LinkedList list;
  
  public Question25()
  {
    list = new LinkedList();
    list.insert(1);
    list.insert(3);
    list.insert(5);
    list.insert(7);
    list.insert(8);
    list.insert(10);
    Node entry = list.root;
    for(int i=0; i<3; i++)
      entry = entry.next;
    
    Node last = list.root;
    while(last.next!=null)
      last = last.next;
    
    last.next = entry;
    
  }
  
  public Node find()
  {
    markList = new ArrayList<Node>();
    Node current = list.root;
    
    while(true)
    {
      for(int i=0; i<markList.size(); i++)
      {
        if(markList.get(i) == current)
          return current;
      }
      markList.add(current);
      current = current.next;
    }
  }
  
  public static void main(String [] args)
  {
    Question25 answer = new Question25();
    Node node = answer.find();
    if(node!=null)
      System.out.println(node.data);
    
  }
  
  
}