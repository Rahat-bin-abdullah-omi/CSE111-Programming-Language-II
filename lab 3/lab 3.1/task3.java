import java.util.Scanner;
public class task3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int slength=s.length();
    for(int a=0;a<slength;a++)
    {
      char b=s.charAt(a);
      int n=(int)b;
      System.out.println(b+" : "+n);
    } 
  }
}