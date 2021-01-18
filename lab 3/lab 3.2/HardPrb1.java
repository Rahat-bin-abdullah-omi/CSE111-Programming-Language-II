import java.util.Scanner;
public class HardPrb1
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    int sum=0;
    for(int i=0;i<a.length();i++)
    {
      sum=sum+a.charAt(i);
    }
    if(sum%3==0)
    {
      System.out.println(a+" is divisible by 3");
    }
    else
    {
      System.out.println(a+" is not divisible by 3");
    }
  }
}