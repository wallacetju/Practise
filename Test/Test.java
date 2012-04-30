
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test
{
  public static void main(String[] args)
  {
    Test test = new Test();
    test.calcDate(System.currentTimeMillis());
  }
  
  private void calcDate(long millisecs) {
  SimpleDateFormat date_format = new SimpleDateFormat("MMM dd,yyyy HH:mm");
  Date resultdate = new Date(millisecs);
  System.out.println(date_format.format(resultdate));
 }
}