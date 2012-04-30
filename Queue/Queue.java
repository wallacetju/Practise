package Queue;
// This is implemented by LinkedList
public class Queue
{
  private Node front;
  private Node back;
   
  public void push(int data)
  {
    if(front==null)
    {
      back = new Node(data);
      front = back;
    }
    else
    {      
      back.next = new Node(data);
      back = back.next;
    }
  }
  
  public Node pop()
  {
    if(front!=null)
    {
    Node node = front;
    front = front.next;
    return node;
    }
    else 
    {
      System.out.println("You hava reached the end of the queue!");
      return null;
    }
  }
  
  public static void main(String [] args)
  {
    Queue queue = new Queue();
    queue.push(1);
    queue.push(3);
    queue.push(5);
    queue.push(7);
    queue.push(8);
    queue.pop().display();
    queue.pop().display();
    queue.pop().display();
    queue.pop().display();
    queue.pop().display();
    Stack stack = new Stack();
    stack.push(1);
    stack.push(3);
    stack.push(5);
    stack.push(7);
    stack.push(8);
    stack.pop().display();
    stack.pop().display();
    stack.pop().display();
    stack.pop().display();
    stack.pop().display();
      
   
  }
  
  
}