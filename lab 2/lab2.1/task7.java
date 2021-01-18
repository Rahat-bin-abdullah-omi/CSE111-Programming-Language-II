import java.util.Scanner;
public class task7 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
    }
    for(int a=0;a<array.length;a++)
    {
      System.out.println(array[a]);
    }
    sc.close();
  }
}