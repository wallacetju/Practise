package Queue;
// This is implemented by LinkedList;
public class Stack
{
  private Node top;
  public void push(int data)
  {
    /**
    if(top==null)
    {
      top = new Node(data);
    }
    else
    {  
    **/
      Node node = new Node(data);
      node.next = top;
      top = node;
    /**}**/  
  }
  
  public Node pop()
  {
    
    if(top == null)
    {
      return null;
    }
    else
    {
      Node node = top;
      top = top.next;
      return node;
    }
  }
}