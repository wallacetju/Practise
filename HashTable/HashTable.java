package HashTable;

public class HashTable
{
  private DataItem[] hashArray;
  public int arraySize;
  private DataItem nonItem;
  
  public HashTable(int arraySize)
  {
    this.arraySize = arraySize;
    this.hashArray = new DataItem[arraySize];  
    nonItem = new DataItem(-1,"");
  }
  
  public void display()
  {
    System.out.println("The hash table is:");
    for(int i=0; i<arraySize; i++)
    {
      if(hashArray[i]==null || hashArray[i].getKey()==-1)
        System.out.print("*");
      else      
        System.out.print(" "+ hashArray[i].getKey() + "-" + hashArray[i].getValue());      
    }
    System.out.println();
    System.out.println("The hash table ends;");
    
  }
  
  private int hashFunc(int key)
  {
    return key%arraySize;    
  }
  
  public DataItem find(int key)
  {
    int pos = hashFunc(key);
    if(hashArray[pos]==null)
      return null;
    while(hashArray[pos].getKey() != key)
    {
      pos++;
      pos = (pos<arraySize)?pos:(pos%arraySize);
      if(pos == key)
      {
        System.out.println("Can't find the item!");
        return null;
      }     
    }
    System.out.println("Found! The item is in position "+pos+". Value is"+hashArray[pos].getValue());
    return hashArray[pos];
    
  }
  
  public void insert(int key, String value)
  {
    int pos = hashFunc(key);
    while(hashArray[pos]!=null&&hashArray[pos].getKey()!=-1)
    {
      pos++;
      pos = (pos<arraySize)?pos:(pos%arraySize);
      if(pos == key)
      {
        System.out.println("The hash table is full. Can't insert!");
        return;
      }
    }
    hashArray[pos] = new DataItem(key,value);    
  }
  
  public void delete(int key)
  {
    int pos = hashFunc(key);
    while(hashArray[pos].getKey() != key)
    {
      pos++;
      pos = (pos<arraySize)?pos:(pos%arraySize);
      if(pos == key)
      {
        System.out.println("Can't find the item to be deleted!");
        return;
      }     
    }
    hashArray[pos] = nonItem; 
  }
  
  public static void main(String[] args)
  {
    HashTable hashTable = new HashTable(17);
    hashTable.insert(38,"Fang");
    hashTable.insert(35,"xiaohong");
    hashTable.insert(55,"Li");
    hashTable.insert(56,"Song");
    hashTable.display();
    hashTable.delete(35);
    hashTable.display();
  }
  
  
  
  
}