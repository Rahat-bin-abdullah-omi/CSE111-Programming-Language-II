import java.util.Scanner;
public class task8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    int []array1=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
      if(array[a]<0 || array[a]>9)
      {
        System.out.println("out of range");
        a--;
      }
    }
    for(int a=0;a<array.length;a++)
    {
      for(int b=0;b<array.length;b++)
      {
        if(array[a]==b)
        {
          array1[b]++;
        }
      }
    }
    for(int a=0;a<array.length;a++)
    {
      if(array1[a]>=2 && array1[a]<=4)
      {
        System.out.print(a+",");
      }
    }
    System.out.println();
    sc.close();
  }
}