import java.util.Scanner;
public class task7b {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    int c=a.compareToIgnoreCase(b);
    System.out.println(c);
  }
}