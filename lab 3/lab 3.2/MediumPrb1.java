import java.util.Scanner;
public class MediumPrb1 
{
   public static void main(String args[]) 
   {
     Scanner sc=new Scanner(System.in);
     String srt=sc.nextLine();
     for(int a=0;a<srt.length();a++)
     {
       for(int b=0;b<=a;b++)
       {
         System.out.print(srt.charAt(b));
       }
       System.out.println();
     }
     sc.close();
   }
}