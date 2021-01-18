import java.util.Scanner;
public class HardPrb3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
    int n=0;
    for(int a=0;a<s.length();a++){
      if((int)s.charAt(a)<=91 && (int)s.charAt(a)>=65){
        for(int b=a;b>=n;b--){
        System.out.print(s.charAt(b));
        }
        n=a+1;
      }
    }
    sc.close();
  }
}