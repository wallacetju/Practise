import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class csvTestReader
{
  public static void main(String[] args)
  {
    csvTestReader reader = new csvTestReader();
    reader.read();
  }
  public void read()
  {
    InputStreamReader fr = null;
    BufferedReader br = null;
    try
    {
      fr = new InputStreamReader(new FileInputStream("sample.csv"));
      br = new BufferedReader(fr);
      String rec = null;
      String[] argsArr = null;
      while((rec = br.readLine())!=null)
      {
        System.out.println(rec);
        argsArr = rec.split(",");
      //  for(int i=0;i<argsArr.length;i++)
      //  {
      //    System.out.println("Num "+(i+1)+ " value equals "+argsArr[i]);
      //  }        
      }
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
    finally
    {
      try
      {
        if(fr!=null)
          fr.close();
        if(br != null)
          br.close();
      }
      catch(IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}