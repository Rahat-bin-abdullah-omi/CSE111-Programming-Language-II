import java.util.Scanner;
public class task4 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[5];
    array[0]=sc.nextInt();
    for(int a=1;a<array.length;a++)
    {
      array[a]=sc.nextInt();
      for(int b=0;b<a;b++)
      {
        if(array[b]==array[a])
        {
          System.out.println(array[a] +" is already in among the entered numbers");
          a--;
        }
      }
    }
    for(int a=0;a<array.length;a++)
    {
      System.out.println(array[a]);
    }
    sc.close();
  }
}