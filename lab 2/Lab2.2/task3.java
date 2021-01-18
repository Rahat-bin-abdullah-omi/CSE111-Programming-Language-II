import java.util.Scanner;
public class task3 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
    }
    for(int a=0;a<array.length;a++)
    {
      for(int b=0;b<array.length;b++)
      {
        if(array[a]>array[b])
        {
          int temp=array[a];
          array[a]=array[b];
          array[b]=temp;
        }
      }
    }
    for(int a=0;a<array.length;a++)
    {
      System.out.println(array[a]);
    }
    sc.close();
  }
}