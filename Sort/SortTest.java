package Sort;

public class SortTest
{
  private int[] data;
  private int top;
  private int size;
  private int count=0;
  public SortTest(int size)
  {
    this.size = size;
    data = new int[size];
    top = 0;
  }
  
  public void insert(int num)
  {
    if(top < size)
      data[top++] = num;
  }
  
  public void display()
  {
    for(int i=0; i<top; i++)
    {
      System.out.println(data[i]);
    }
    System.out.println(count);
  }
  public void swap(int i, int j)
  {
    int n = data[i];
    data[i] = data[j];
    data[j] = n;
  }
  public void bubbleSort()
  {
    for(int j=top-1; j>0; j--)
      for(int i=0; i<j; i++)
    {
      if(data[i]>data[i+1])
        swap(i,i+1);
      count++;
    }    
  }
  public void selectionSort()
  {
    for(int i=0; i<top-1;i++)
    {
      int height = data[i];
      int minimum = i;
      for(int j=i+1; j<top; j++)
      {
        count++;
        if(data[j]<height)
        {
          height = data[j];
          minimum = j;
        }
      }
      swap(i,minimum);
    }
  }
  public void insertionSort()
  {
    for(int i=1;i<top-1;i++)
    {
      int num = data[i+1];
      for(int j=i;j>0;j--)
      {
        count++;
        if(num < data[j])
          data[j+1] = data[j];
        else
        {
          data[j+1]=num;
          break;
        }
      }
      
    }
  }
  
  public void quickSort(int begin, int end)
  {
    if(begin>=end)
      return;
      
    int pivot = data[end];
    int front=begin-1;
    
   // System.out.println(begin+" "+data[begin]+" "+end+" "+data[end]);
    for(int back = begin; back<end; back++)
    {
      
      if(data[back]<=pivot)
      {
        swap(++front,back);
      }
    }
    swap(end,front+1);
    quickSort(begin,front);
    quickSort(front+1,end);
        
    
  }
  
  public static void main(String[] args)
  {
    SortTest test = new SortTest(20);
    test.insert(20);
    test.insert(3);
    test.insert(5);
    test.insert(6);
    test.insert(7);
    test.insert(324);
    test.insert(134);
    test.insert(34);
    test.insert(12);
    test.insert(55);
    test.quickSort(0,9);
    test.display();
    
    
  }
  
  
}