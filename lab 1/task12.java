import java.util.Scanner;
public class task12
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
      for(int c=1;c<=2*a-1;c++)
      {
        if(c==1 || c==2*a-1)
        {
          System.out.print(c);
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int a=col-1;a>=1;a--)
    {
      for(int b=a;b<col;b++)
      {
        System.out.print(" ");
      }
      for(int c=1;c<=2*a-1;c++)
      {
        if(c==1 || c==2*a-1)
        {
          System.out.print(c);
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