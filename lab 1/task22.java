import java.util.Scanner;
public class task22
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int a=1;a<=n;a++)
    {
      for(int b=1;b<=a;b++)
      {
        if(b==1 || b==a || a==n)
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