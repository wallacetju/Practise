package LinkedList;
public class LinkedList
{
  public Node root;
  
  public void insert(int data)
  {
    Node node = new Node(data);
    node.next = root;
    root = node;    
  }
  
  public void attach(int data)
  {
    if(root==null)
      root = new Node(data);
    else
    {
      Node current = root;
      while(current.next != null)
        current = current.next;

      current.next = new Node(data);
    }
  }
  
  public Node find(int key)
  {
    Node current = root;
    while(current!=null)
    {
      if(current.data == key)
      {
        System.out.println("Found it!");
        return current;
      }
      current = current.next;      
    }
    System.out.println("Not found in the whole list!");
    return null;    
  }
  
  
  public void delete(int key)
  {
    Node parent = root;
    Node child = root.next;
    if(root.data == key)
    {
      root = null;
      System.out.println("Deleted! ");
      return;
    }
    while(child != null)
    {
      if(child.data == key)
      {
        parent.next = child.next; 
        System.out.println("Key " + key + "deleted!");
        return;
      }
      parent = child;
      child = child.next;      
    }   
  }
  
  public void display()
  {
    Node current = root;
    while(current!=null)
    {
      System.out.println("The data in this node is: "+ current.data);
      current = current.next;
    }    
  }
  /**
   public static void main(String[] args)
   {
   LinkedList list = new LinkedList();
   list.insert(5);
   list.insert(3);
   list.insert(4);
   list.insert(6);
   list.display();
   list.delete(5);
   list.display();
   list.find(8);
   list.find(3);
   
   }
   **/
  
  
  
}