package Array;
public class Question13
{
  private char[] data;
  private int front,back;
  
    public Question13(String data)
  {
    this.data = data.toCharArray();
    System.out.println(this.data);
  }
    
  public void removeDuplicate()
  {
    front=0;
    back=0;
    boolean marker=true;
    for(int back=1;back<data.length;back++)
    {
     
      for(int i=0; i<=front;i++)
      {
        if(data[i] == data[back])
        {
          marker=false;
          break;
        }
      }
      if(marker==true)
      {
        front++;
        
        swap(front,back);
      }
      else
      {
        marker=true;
      }      
    }
   }

  public void display()
  {
    System.out.println(data);
    System.out.println();
    
    for(int i=0; i<=front;i++)
    {
      System.out.print(data[i]);
    }
  }
  
   public void swap(int i, int j)
  {
    char n = data[i];
    data[i] = data[j];
    data[j] = n;
  }
  public static void main(String[] args)
  {
    Question13 answer = new Question13("what's your name?Please dont's say it again");
    answer.removeDuplicate();
    answer.display();
  }
   
   
}