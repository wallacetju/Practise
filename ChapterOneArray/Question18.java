package Array;

public class Question18
{

  public boolean isSubstring(String first, String last)
  {
    if(last.contains(first))
      return true;
    else
      return false;
    
  }
  public boolean isRotation(String first, String last)
  {
    if(first.length()!=last.length())
      return false;
     String bigString = last+last;
     if(isSubstring(first, bigString))
       return true;
     else
       return false;
  }
  public static void main(String [] args)
  {
    Question18 answer = new Question18();
    System.out.println(answer.isRotation("water", "aterw"));
    
  }
  
}