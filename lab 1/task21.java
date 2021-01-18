import java.util.Scanner;
public class task21
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int a=1;a<=n;a++)
    {
      for(int b=1;b<=m;b++)
      {
        if(b==1 || b== m || a==1 || a== n)
        {
          System.out.print("*");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}