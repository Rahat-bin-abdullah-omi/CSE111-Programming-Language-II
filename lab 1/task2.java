import java.util.Scanner;
public class task2
{
  public static void main(String[]args)
  {
    Scanner QQ=new Scanner(System.in);
    int c=QQ.nextInt();
    int r=QQ.nextInt();
    for(int a=1;a<=c;a++)
    {
      for(int b=1;b<=r;b++)
      {
      System.out.print(b);
      }
      System.out.println();
    }
  }
}