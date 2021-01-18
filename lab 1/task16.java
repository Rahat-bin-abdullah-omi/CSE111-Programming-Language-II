import java.util.Scanner;
public class task16
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    for(int col=1;col<=n;col++)
    {
      for(int row=1;row<=m;row++)
      {
        System.out.print("*");
      }
    System.out.println();
    }
  }
}