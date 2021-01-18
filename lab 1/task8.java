import java.util.Scanner;
public class task8
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    for(int col=1;col<=A;col++)
    {
      if(col==1 || col==A)
      {
        for(int a=1;a<=B;a++)
        {
          System.out.print(a);
        }
      }
      else
      {
        for(int b=1;b<=B;b++)
        {
          if(b==1 || b==B)
          {
            System.out.print(b);
          }
          else
          {
            System.out.print(" ");
          }
        }
      }
      System.out.println();
    }
  }
}