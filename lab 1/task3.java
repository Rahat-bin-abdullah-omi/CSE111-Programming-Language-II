import java.util.Scanner;
public class task3 {
  public static void main(String[] args) {
    Scanner QQ=new Scanner(System.in);
    int C=QQ.nextInt();
    for(int a=1;a<=C;a++)
    {
      for(int b=1;b<=a;b++)
      {
        System.out.print(b);
      }
      System.out.println();
    }
  }
}