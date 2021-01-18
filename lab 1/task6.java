import java.util.Scanner;
public class task6
{
  public static void main(String[]args)
  {
    Scanner QQ=new Scanner(System.in);
    int cl=QQ.nextInt();
    for(int a=1;a<=cl;a++)
    {
      for(int b=1;b<=cl-a;b++)
      {
        System.out.print(" ");
      }
      for(int c=1;c<=2*a-1;c++)
      {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}