import java.util.Scanner;
public class task9 
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int col=sc.nextInt();
    for(int a=1;a<=col;a++)
    {
      for(int b=1;b<=a;b++)
      {
       if(b==1 || b==a || a==col)
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