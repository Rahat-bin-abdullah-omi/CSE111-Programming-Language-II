import java.util.Scanner;
public class task9 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
    }
    for(int a=0;a<array.length;a++)
    {
      int pos=a+1;
      if(pos%2==1)
      {
        System.out.print(array[a]+", ");
      }
    }
    for(int a=0;a<array.length;a++)
    {
      int pos=a+1;
      if(pos%2==0)
      {
        System.out.print(array[a]+", ");
      }
    }
    sc.close();
  }
}