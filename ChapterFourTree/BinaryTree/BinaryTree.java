package BinaryTree;
public class BinaryTree
{
  private Node root;
  public BinaryTree(int key)
  {
    this.root = new Node(key);
  }
  public Node find(int key)
  {
    Node current = root;
    while(current.key!=key)
    {
      if(current.key < key)
        current=current.left;
      else
        current = current.right;      
    }
    if(current == null)
      return null;
    else
      return current;
  }
  
  public void insert(int key)
  {    
    Node parent = root;
    Node current = null;
   
    if(parent.key==key)
    {
      System.out.println("Duplicate not allowed!");
      return;
    }
    else if(key < parent.key)
      current = parent.left;
    else current = parent.right;     
    
    while(current!=null)
    {
      if(current.key==key)
      {
       System.out.println("Duplicate not allowed!");
       return;
      }
      else if(key < current.key)
      {
        parent = current;
        current = current.left;
        
      }
      else 
      {
        parent = current;
        current = current.right;
        
      }
    }
    
    if(key< parent.key)
      parent.left = new Node(key);
    else 
      parent.right = new Node(key);
          
  }
  public void delete(int key)
  {
  }
  public Node root()
  {
    return root;
  }
  public void preOrder(Node current)
  {
      if(current==null)
       return;
      System.out.println(current.key);
      preOrder(current.left);
      preOrder(current.right);
  }
  public void postOrder(Node current)
  {
     if(current==null)
       return;
      postOrder(current.left);
      postOrder(current.right);     
      System.out.println(current.key);     
  }
  
  public void inOrder(Node current)
  {
     if(current==null)
       return;
      inOrder(current.left);
      System.out.println(current.key);
      inOrder(current.right);     
      
     
  }
  
  public static void main(String[] args)
  {
    BinaryTree tree = new BinaryTree(2); 
    tree.insert(5);
    tree.insert(34);
    tree.insert(56);
    tree.insert(22);
    tree.insert(23);
    tree.insert(44);
    System.out.println("PreOrder");
    tree.preOrder(tree.root());
    System.out.println("PostOrder"); 
    tree.postOrder(tree.root());
    System.out.println("InOrder"); 
    tree.inOrder(tree.root());
  }
}