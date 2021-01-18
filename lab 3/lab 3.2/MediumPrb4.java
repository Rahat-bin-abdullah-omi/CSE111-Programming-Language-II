import java.util.Scanner;
public class MediumPrb4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    char b=a.charAt(0);
    String newString=String.valueOf(b);
    for(int c=1;c<a.length();c++){
      if(a.charAt(c)!=a.charAt(c-1)){
      String z=String.valueOf(a.charAt(c));
      newString=newString+z;
      }
    }
    System.out.println(newString);
  }
}