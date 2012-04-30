package question21;
import LinkedList.*;
import HashTable.*;

public class Question21
{
  private LinkedList list;
  private HashTable markTable;
  
  public Question21()
  {
    list = new LinkedList();
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insert(5);
    list.insert(8);
    list.insert(4);
    list.insert(6);
    list.insert(3);
    list.insert(5);
    markTable = new HashTable(20);   
  }
    
  public void removeDuplicate()
  {
    Node current = list.root;
    Node parent = current;
    while(current!=null)
    {      
        
      if(markTable.find(current.data)!=null)
      {
        System.out.println(parent.data+" "+current.data);
        parent.next = current.next;
      }
      else
      {
        markTable.insert(current.data,"1");
       
      }
      parent = current;
      current = current.next;
    }    
  }
  
  public void display()
  {
    markTable.display();
    list.display();
  }
  
  public static void main(String[] args)
  {
    Question21 answer = new Question21();
     answer.display();
    answer.removeDuplicate();
    answer.display();
  }
  
  
  
}
  