import java.util.Scanner;
public class task6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=1;
    for(int a=2;a<=n;a++)
    {
      if(a%2==0)
      {
        sum=sum-(a*a);
      }
      else
      {
        sum=sum+(a*a);
      }
    }
    System.out.println(sum);
    sc.close();
  }
}