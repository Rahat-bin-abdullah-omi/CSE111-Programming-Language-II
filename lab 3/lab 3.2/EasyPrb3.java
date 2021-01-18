import java.util.Scanner;
public class EasyPrb3
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    String srt=sc.nextLine();
    for(int a=0;a<srt.length();a++)
    {
      int b=srt.charAt(a);
      if(b!=32)
      {
        System.out.print((char)(b-1));
      }
      else
      {
        System.out.print((char)b);
      }
    }
    System.out.println();
    sc.close();
  }
}