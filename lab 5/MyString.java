public class MyString { 
  
  char string_array[]; 
  int size; 
  
  public MyString() { 
    // TODO: Constructor for an empty string. 
    // Initialize the global variables. 
  } 
  
  public MyString(String new_string) { 
    string_array=new_string.toCharArray();
    size=string_array.length;
    
  } 
  //------task1-------
  public int length() {  
    return size; 
  } 
  //------task2--------
  public char charAt(int n){ 
    return string_array[n]; 
  } 
  //----------task3------
  public boolean startsWith(String substring){ 
    char substring_array[]=substring.toCharArray();
    if(substring_array.length<=string_array.length)
    {
      int count=0;
      for(int a=0;a<substring.length();a++)
      {
        if(substring_array[a]==string_array[a])
        {
          count++;
        }
      }
      if(count==substring.length())
      {
        return true;
      }
      else{
        return false;
      }
    }
    else{
      return false;
    }
  } 
  //-----------task4---------
  public boolean endsWith(String substring){ 
    char substring_array[]=substring.toCharArray();
    if(substring_array.length<=string_array.length)
    {
      int j=string_array.length-1;
      for(int a=substring_array.length-1;a>=0;a--)
      {
        if(substring_array[a]!=string_array[j])
        {
          return false;
        }
        j--;
      }
      return true;
    }
    else
    {
      return false;
    }
  }
  
  //---------task 5-----------
  public String replaceFirst(char oldChar, char newChar){
    String string1=String.valueOf(string_array);
    char [] newStringArray=string1.toCharArray();
    for(int a=0;a<newStringArray.length;a++)
    {
      if((int)newStringArray[a]==(int)oldChar)
      {
        newStringArray[a]=newChar;
        break;
      }
    }
    String string2=String.valueOf(newStringArray);
    return string2;
  }
  //-----task6----------
  public String replaceAll(char oldChar, char newChar) { 
    String string1=String.valueOf(string_array);
    char [] newStringArray=string1.toCharArray();
    for(int a=0;a<newStringArray.length;a++)
    {
      if((int)newStringArray[a]==(int)oldChar)
      {
        newStringArray[a]=newChar;
        
      }
    }
    String string2=String.valueOf(newStringArray);
    return string2;
  } 
  //------task7----------
  public String replaceLast(char oldChar, char newChar) { 
    String string1=String.valueOf(string_array);
    char[] newStringArray=string1.toCharArray();
    for(int a=newStringArray.length-1;a>=0;a--)
    {
      if(newStringArray[a]==oldChar)
      {
        newStringArray[a]=newChar;
        break;
      }
    }
    String string2=String.valueOf(newStringArray);
    return string2;
  } 
  //---------task8-----------
  public String toLowerCase(String new_string){ 
    char[] newStringArray=new_string.toCharArray();
    for(int a=0;a<newStringArray.length;a++)
    {
      if((int)newStringArray[a]>=65 && (int)newStringArray[a]<=89)
      {
        int z=(int)(newStringArray[a])+32;
        newStringArray[a]=(char)(z);
      }
    }
    String string2=String.valueOf(newStringArray);
    return string2;
  } 
  //-------task9---------
  public String toUpperCase(String new_string) {
    char[] newStringArray=new_string.toCharArray();
    for(int a=0;a<newStringArray.length;a++)
    {
      if(newStringArray[a]>=97 && newStringArray[a]<=123)
      {
        newStringArray[a]=(char)((int)(newStringArray[a])-32);
      }
    }
    String string1=String.valueOf(newStringArray);
    return string1;
  } 
  //------------task10--------------
  public boolean equals(String new_string){ 
    char[] newStringArray=new_string.toCharArray();
    for(int a=0;a<newStringArray.length;a++)
    {
      if(newStringArray[a]!=string_array[a])
      {
        return false;
      }
    }
    return true;
  } 
  //--------------task11---------
  public boolean equalsIgnoreCase(String new_string){ 
    char[] newStringArray=new_string.toCharArray();
    int count=0;
    for(int a=0;a<newStringArray.length;a++)
    {
      if((int)string_array[a]==(int)newStringArray[a] || (int)string_array[a]==((int)newStringArray[a]+32) || (int)string_array[a]==((int)newStringArray[a]-32))
      {
        count++;
      }
    }
    if(count==newStringArray.length){
      return true;
    }
    else{
      return false;
    }
  }
  //----------------task12---------
  public int compareTo(String s) { 
    char[] newStringArray=s.toCharArray();
    if((int)string_array.length<(int)newStringArray.length)
    {
      return (string_array.length-newStringArray.length);
    }
    else
    {
      for(int a=0;a<newStringArray.length;a++)
      {
        if((int)newStringArray[a]!=(int)string_array[a])
        {
          return ((int)string_array[a]-(int)newStringArray[a]);
        }
      }
    }
    return 0;
  } 
  //------------task13----------
  public int compareToIgnoreCase(String s) { 
    char[] newStringArray=s.toCharArray();
    if((int)string_array.length<(int)newStringArray.length)
    {
      return (string_array.length-newStringArray.length);
    }
    else
    {
      for(int a=0;a<newStringArray.length;a++)
      {
        if((int)newStringArray[a]!=(int)string_array[a] || (int)newStringArray[a]!=((int)string_array[a]+32) || ((int)newStringArray[a]+32)!=(int)string_array[a])
        {
          return ((int)string_array[a]-(int)newStringArray[a]);
        }
      }
    }
    return 0;
  }
  
  //----------task14-------
  public String substring(int start){
    String b="";
    for(int a=start;a<string_array.length;a++)
    {
      b=b+string_array[a];
    }
    return b;
  } 
  //---------task15-------
  public String substring(int start, int end){ 
    String b="";
    for(int a=start;a<end;a++)
    {
      b=b+string_array[a];
    }
    return b;
  } 
  //-----task16-------
  public int indexOf(char mychar) { 
    for(int a=0;a<string_array.length;a++)
    {
      if(string_array[a]==mychar)
      {
        return a;
      }
    }
    return -1;
  } 
  //-----------task17--------
  public int lastIndexOf(char mychar) { 
    for(int a=string_array.length-1;a>=0;a--)
    {
      if(string_array[a]==mychar)
      {
        return a;
      }
    }
    return -1;
  }  
  //--------task18---------
  public int indexOf(char mychar, int n) { 
    for(int a=n;a<string_array.length;a++)
    {
      if(string_array[a]==mychar)
      {
        return a;
      }
    }
    return -1;
  } 
  //--------task19-------
  public int lastIndexOf(char mychar, int n) { 
    for(int a=0;a<=n;a++)
    {
      if(string_array[a]==mychar)
      {
        return a;
      }
    }
    return -1; 
  } 
  
  //--------------task20----------
  public String concat(String new_string) { 
    String mainString=String.valueOf(string_array);
    mainString=mainString+new_string;
    char newStringArray[]=mainString.toCharArray();
    return String.valueOf(newStringArray);
  }  
  
//  public String toString() { 
//    return new String(string_array); 
//  } 
}