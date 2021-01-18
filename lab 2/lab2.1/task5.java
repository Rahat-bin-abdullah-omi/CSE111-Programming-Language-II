import java.util.Scanner;
public class task5 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] array=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
    }
    int n=sc.nextInt();
    int count=0;
    for(int a=0;a<array.length;a++)
    {
      if(array[a]==n)
      {
        count++;
      }
    }
    if(count>0)
    {
      System.out.println("yes");
    }
    else
    {
      System.out.println("no");
    }
    sc.close();
  }
}