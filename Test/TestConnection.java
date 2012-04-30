import java.io.InputStreamReader;
import java.io.IOException;  
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.HttpEntity;  
import org.apache.http.HttpResponse;  
import org.apache.http.client.ClientProtocolException;  
import org.apache.http.client.entity.UrlEncodedFormEntity;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.impl.client.DefaultHttpClient;  
import org.apache.http.message.BasicNameValuePair;  
import org.apache.http.protocol.HTTP;  
import org.apache.http.util.EntityUtils;  

public class TestConnection
{
  public void post()
  { 
    try {  
      DefaultHttpClient mHttpClient = new DefaultHttpClient(); 
      HttpPost mPost = new HttpPost("http://fangfangandshuai.com/testConnection.php");  
      HttpResponse response = mHttpClient.execute(mPost);  
      int res = response.getStatusLine().getStatusCode();  
      if (res == 200) {  
        HttpEntity entity = response.getEntity();  
        if (entity != null) {  
          String info = EntityUtils.toString(entity);  
          System.out.println("info-----------"+info);  
        }
        
      }
    }
    catch(ClientProtocolException e)
    {
      System.out.println("Client Protocol Exception");
    }
    catch(IOException e)
    {
      System.out.println("IO Exception");
    }
  }
  
  public static void main(String [] args)
  {
    TestConnection testConnection = new TestConnection();
    testConnection.post();
  }
  
  
}