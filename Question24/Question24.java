package Question24;
import LinkedList.*;
public class Question24
{
  private LinkedList numOne;
  private LinkedList numTwo;
  private LinkedList sum;
  
  public Question24(int[] one, int[] two)
  {
    numOne = new LinkedList();
    numTwo = new LinkedList();
    for(int i=0; i<one.length; i++)
      this.numOne.insert(one[i]);
    for(int i=0; i<two.length; i++)
      this.numTwo.insert(two[i]);
  }
  
  public void  sum()
  {
    Node currentOne = numOne.root;
    Node currentTwo = numTwo.root;
    sum = new LinkedList();
    int digit = 0;
    
    while(currentOne!=null || currentTwo!=null)
    {
      int num = digit;
      if(currentOne!=null)
      {
        num+=currentOne.data;
        currentOne = currentOne.next;        
      }        
      if(currentTwo!=null)
      {
        num+=currentTwo.data;
        currentTwo = currentTwo.next;
      }
      if(num>=10)
      {
        num %= 10;
        digit = 1;
      }
      else
        digit=0; 
      
      sum.attach(num);
    }
    
    if(digit == 1)
      sum.attach(digit); 
    
  }
  public void display()
  {
    loop(sum.root);
    System.out.println();
  }
  
  public void loop(Node node)
  {
    if(node.next!=null)
      loop(node.next);    
    System.out.print(node.data);
  }
  
  public static void main(String[] args)
  {
    Question24 answer = new Question24(new int[]{2,0,3,4,2}, new int[]{2,1,5,3,4});
    answer.sum();
    answer.display();
  }
  
}