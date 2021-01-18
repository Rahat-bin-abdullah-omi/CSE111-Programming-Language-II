import java.util.Scanner;
public class HardPrb4
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int y=sc.nextInt();
    sc=new Scanner(System.in);
    String b=sc.nextLine();
    for(int i=0;i<b.length();i++){
      int j=(int)b.charAt(i)+y;
      System.out.print((char)j);
    }
  }
}
        