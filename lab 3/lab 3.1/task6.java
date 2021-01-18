import java.util.Scanner;
public class task6 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String s = a.concat("==THE END==");
    System.out.println(a+"\n"+s+"\n"+a);
  }
}