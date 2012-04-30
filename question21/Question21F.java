package question21;
import LinkedList.*;
public class Question21F
{
  private LinkedList list;
  
  public Question21F()
  {
    list = new LinkedList();
    list.insert(1);
    list.insert(3);
    list.insert(5);
    list.insert(7);
    list.insert(8);
    list.insert(12);
    list.insert(10);
    list.insert(12);
    list.insert(3);
    list.insert(1);
    list.insert(9);
  }
  
  public void removeDup()
  {
    Node current = list.root;
    Node parent = current;
    while(current != null)
    {
      Node check =list.root;
      boolean isDup = false;
      while(check!=current)
      {
        if(check.data == current.data)
        {
          isDup = true;
          break;
        }
        check = check.next;
      }
      if(isDup)
      {
        current = current.next;
        parent.next = current;
      }
      else
      {
        parent = current;
        current = current.next;
      }
    }
  }
  
  public void display()
  {
    list.display();
  }
  
  public static void main(String [] args)
  {
    Question21F answer = new Question21F();
    answer.display();
    answer.removeDup();
    System.out.println();
    answer.display();
  }
  
  
  
}