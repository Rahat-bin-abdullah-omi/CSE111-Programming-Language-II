import java.util.Scanner;
public class task7 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    for(int a=1;a<=A;a++)
    {
      for(int b=1;b<=A-a;b++)
      {
        System.out.print(" ");
      }
      for(int c=1;c<=2*a-1;c++)
      {
        System.out.print(c);
      }
      System.out.println();
    }
    for(int a=A-1;a>=1;a--)
    {
      for(int c=a;c<A;c++)
      {
        System.out.print(" ");
      }
      for(int b=1;b<=2*a-1;b++)
      {
        System.out.print(b);
      }
      System.out.println();
    }
  }
}