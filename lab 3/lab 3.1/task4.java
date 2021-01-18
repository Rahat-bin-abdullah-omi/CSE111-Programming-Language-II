import java.util.Scanner;
public class task4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []array=new int[91];
    String s=sc.nextLine();
    int n=s.length();
    for(int a=0;a<s.length();a++)
    {
      char c=s.charAt(a);
      int d=(int)c;
      for(int b=65;b<=90;b++)
      {
        if(d==b)
        {
          array[b]++;
        }
      }
    }
    for(int a=65;a<=90;a++)
    {
      char g=(char)a;
      System.out.println(g+" which is "+a+" was found "+array[a]+" times");
    }
  }
}