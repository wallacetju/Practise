package Test;

import java.util.Date;
public class DateConvert
{
  /***
    *        The main purpose for this function is 
    * to do complex conversion between storage value and 
    * Double value which is used in Graph drawing.
    *     What this function is to do is to calculate the 
    * double value difference between a set time and the 
    * stored time. Integer part stands for the days, and
    * decimal part stands for hour&mins.
    * 
    * 
    **/
  public Double convertToDouble (Date date)
  {
    long longDate = date.getTime()/(3600*1000*24);    
    double doubleDate =  (double)longDate + (double)(date.getTime()%(3600*1000*24))/(3600*1000*24);//better precision?
    return doubleDate;    
  }
  public Date convertToDate(double date)
  {
    long longDate = (long)(date*(3600*1000*24));
    return new Date(longDate);
  } 
  public static void main(String[] args)
  {
    DateConvert dateConvert = new DateConvert();
    Date date = new Date();
    System.out.println(date); 
    Double doubleDate = dateConvert.convertToDouble(date);
    System.out.println(doubleDate);  
    Date date2 = dateConvert.convertToDate(doubleDate);
    System.out.println(date2);
  }
  
   
}