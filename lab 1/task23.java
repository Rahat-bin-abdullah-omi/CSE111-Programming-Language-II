import java.util.Scanner;
public class task23
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int a=1;a<=n;a++)
    {
      for(int b=1;b<=n-a;b++)
      {
        System.out.print(' ');
      }
      for(int c=1;c<=a;c++)
      {
        if(c==1 || c==a || a==n)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(' ');
        }
      }
      System.out.println();
    }
  }
}