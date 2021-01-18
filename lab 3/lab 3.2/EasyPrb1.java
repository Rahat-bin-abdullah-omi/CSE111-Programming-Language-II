import java.util.Scanner;
public class EasyPrb1 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String srt=sc.nextLine();
    int []array=new int[srt.length()];
    for(int a=0;a<array.length;a++)
    {
      array[a]=(int)(srt.charAt(a));
    }
    for(int a=0;a<array.length;a++)
    {
      for(int b=0;b<array.length;b++)
      {
        if(array[b]>array[a])
        {
          int temp=array[b];
          array[b]=array[a];
          array[a]=temp;
        }
      }
    }
    for(int a=0;a<array.length;a++)
    {
      System.out.print((char)array[a]);
    }
    System.out.println();
    sc.close();
  }
}