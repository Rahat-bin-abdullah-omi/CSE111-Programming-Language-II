import java.util.Scanner;
public class MediumPrb3
{
   public static void main(String args[]) 
   {
     Scanner sc=new Scanner(System.in);
     String a=sc.nextLine();
     String b=" "+sc.nextLine();
     String c=a.concat(b);
     System.out.println(c);
     int sum=0;
     for(int n=0;n<c.length();n++)
     {
       sum=sum+c.charAt(n);
       if((int)c.charAt(n)==32)
       {
         sum=sum-32;
       } 
     }
     System.out.println(sum);
     sc.close();
   }
}