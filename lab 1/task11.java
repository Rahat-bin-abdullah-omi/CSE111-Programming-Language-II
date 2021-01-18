import java.util.Scanner;
public class task11
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int col=sc.nextInt();
    for(int a=1;a<=col;a++)
    {
      for(int b=1;b<=col-a;b++)
      {
        System.out.print(" ");
      }
      for(int b=1;b<=2*a-1;b++)
      {
        if(b==1 || b==2*a-1 || a==col)
        {
          System.out.print(b);
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