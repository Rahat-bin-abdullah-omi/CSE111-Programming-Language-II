import java.util.Scanner;
public class tsak10
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    int []array1=new int[2];
    int m=0;
    int numbercount=0;
    while(numbercount<=2)
    {
      int n=sc.nextInt();
      if(n<=9 && n>=0)
      {
        for(int a=0;a<array.length;a++)
        {
          if(n==a)
          {
            array[a]++;
          }
          if(array[a]==2)
          {
            array1[m]=a;
            m=1;
            numbercount++;
          }
        }
      }
      else
      {
        System.out.println("out of range");
      }
    }
    for(int a=0;a<array1.length;a++)
    {
      System.out.print(array1[a]+",");
    }
    System.out.println();
    sc.close();
  }
}