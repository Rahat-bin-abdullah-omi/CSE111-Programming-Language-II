import java.util.Scanner;
public class task4 {
  public static void main(String[] args) {
    Scanner QQ=new Scanner(System.in);
    int A=QQ.nextInt();
    for(int c=1;c<=A;c++)
    {
      for(int s=1;s<=A-c;s++)
      {
        System.out.print(" ");
      }
      for(int n=(A-c)+1;n<=A;n++)
      {
        System.out.print(n);
      }
      System.out.println();
    }
  }
}