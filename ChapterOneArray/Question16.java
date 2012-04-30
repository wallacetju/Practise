package Array;
public class Question16
{
  private int[][] data;
  private int[][] rotateData;
  private int length;
  public void rotate()
  {
    rotateData = new int[length][length];
     
    for(int i=0;i<length;i++)
      for(int j=0;j<length;j++)
    {
      rotateData[i][j] = data[j][length-i-1];
    }
  }
  
  public Question16(int length)
  {
    this.length = length;
    data = new int[][]{
      {1,2,3},{4,5,6},{7,8,9}
    };
  }
  public void display()
  {
    for(int j=0; j<length; j++)
    {
    for(int i=0; i<length; i++)
    {
      System.out.print(data[i][j]+" ");
    }
      System.out.println();
    }
    for(int j=0; j<length; j++)
    {
    for(int i=0; i<length; i++)
    {
      System.out.print(rotateData[i][j]+" ");
    }
      System.out.println();
    }
    
  }
  public static void main(String [] args)
  {
    Question16 answer = new Question16(3);
    answer.rotate();
    answer.display();
    
  }
}