package HashTable;

public class DataItem
{
  public int key;
  public String value;
  public DataItem(int key, String value)
  {
    this.key = key;
    this.value = value;
  }
  public int getKey()
  {
    return key;
  }
  public String getValue()
  {
    return value;
  }
}