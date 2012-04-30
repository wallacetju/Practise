package question22;
import LinkedList.*;
public class Question22
{
  private LinkedList list;
  private final int LIST_SIZE = 20;
  public Question22()
  {
    list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.insert(6);
    list.insert(7);
    list.insert(8);
    list.insert(9);
    list.insert(10);
    list.insert(11);
    list.insert(12);
    list.insert(13);
    list.insert(14);
    list.insert(15);
    list.insert(16);
    list.insert(17);
    list.insert(18);
    list.insert(19);
    list.insert(20);
  }
  
  public Node nthToLast(int n)
  {
    if(n > LIST_SIZE)
      return null;
    
    Node front = list.root;
    Node back = list.root;
    
    for(int i=0; i<n-1; i++)
      front = front.next;
    
    while(front.next!=null)
    {
      front = front.next;
      back = back.next;
    }
    return back;
  }
  
  public static void main(String[] args)
  {
    Question22 answer = new Question22();
    System.out.println(answer.nthToLast(7).data);
  }
  
}