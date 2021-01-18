import java.util.Scanner;
public class HardPrb2
{
  public static  void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    int p1=1;
    int p2=1;
    for(int i=0;i<a.length();i++)
    {
      p1=p1*((int)a.charAt(i)-64);
    }
    for(int j=0;j<b.length();j++)
    {
      p2=p2*((int)b.charAt(j)-64);
    }
    if(p1%14<p2%14)
    {
      System.out.println("I Am Happy With My Coach");
    }
    else
    {
      System.out.println("I Am Sad With My Coach");
    }
  }
}
    