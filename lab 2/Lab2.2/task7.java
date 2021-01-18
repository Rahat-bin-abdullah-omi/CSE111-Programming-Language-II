import java.util.Scanner;
public class task7 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []array =new int[11];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
      int count=0;
      for(int b=0;b<=a;b++)
      {
        if(array[a]==array[b])
        {
          count++;
        }
      }
      if(count>4)
      {
        System.out.println("Can't take this number for the 5th time, try other");
        a--;
      }
    }
    for(int a=0;a<array.length;a++)
    {
      System.out.println(array[a]);
    }
    sc.close();
  }
}