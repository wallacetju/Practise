package ChapterFour;
public class Question41
{
  public int longest(Node node)
  {
    if(node == null)
      return 0;
    int left = longest(node.left);
    int right = longest(node.right);
    if(left>right)
      return left;
    else
      return right;    
  }
  public int short()
  
}