import java.util.Scanner;
public class MediumPrb2 
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    int m=1;
    while(m>0)
    {
      String srt=sc.nextLine();
      int []array=new int[srt.length()];
      int []array1=new int[srt.length()];
      int sum=0;
      for(int a=0;a<array.length;a++)
      {
        array[a]=srt.charAt(a);
      }
      for(int a=0;a<array.length;a++)
      {
        for(int b=0;b<array.length;b++)
        {
          if(array[a]==array[b])
          {
            array1[a]++;
          }
        }
      }
      for(int a=0;a<array1.length;a++)
      {
        sum=array1[a]+sum;
      }
      for(int a=0;a<array.length;a++)
      {
        for(int b=a+1;b<array.length;b++)
        {
          if(array[a]==array[b])
          {
            array1[b]=0;
          }
        }
      }
      if(sum==srt.length())
      {
        System.out.println("You entered "+srt);
        m--;
      }
      else
      {
        for(int a=0;a<array1.length;a++)
        {
          if(array1[a]>1)
          {
            System.out.println((char)array[a]+" has been counted "+array1[a]+" times in the word " +srt+"\n"+"Please enter another word");
          }
        }
      }
    }
    sc.close();
  }
}