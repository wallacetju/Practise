package question23;
import LinkedList.*;
public class Question23
{
  private LinkedList list;
  public Question23()
  {
    list = new LinkedList();
    list.insert(1);
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(6);
    list.insert(7);
    list.insert(9);
    list.insert(10);
  }
  
  public void remove(Node node)
  {
    Node remove = node;
    remove.data = node.next.data;
    remove.next = node.next.next;
  }
  
  public Node find(int n)
  {
    Node node = list.root;
    for(int i=0; i<3; i++)
      node = node.next;
    return node;
  }
  
  public void display()
  {
    list.display();
  }
  
  public static void main(String [] args)
  {
    Question23 answer = new Question23();
    answer.display();
    answer.remove(answer.find(3));
    answer.display();
  }
}

