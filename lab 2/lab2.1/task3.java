import java.util.Scanner;
public class task3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
    }
    for(int a=array.length-1;a>=0;a--)
    {
      System.out.println(array[a]);
    }
    sc.close();
  }
}