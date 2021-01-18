import java.util.Scanner;
public class task2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int slength=s.length();
    for(int a=0;a<slength;a++)
    {
      char b=s.charAt(a);
      System.out.println(b);
    } 
  }
}