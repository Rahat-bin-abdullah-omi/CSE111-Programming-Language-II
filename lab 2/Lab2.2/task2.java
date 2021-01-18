import java.util.Scanner;
public class task2 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
      System.out.print("You have entered ");
      for(int b=0;b<=a;b++)
      {
        if(b!=a)
        {
          System.out.print(array[b]+",");
        }
        else
        {
          System.out.print(array[b]);
        }
      }
      System.out.println();
    }
    sc.close();
  }
}