import java.util.Scanner;
public class task13
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int a=1;a<=n;a++)
    {
      System.out.print(a);
    }
    for(int a=n-1;a>=1;a--)
    {
      System.out.print(a);
    }
    System.out.println();
  }
}