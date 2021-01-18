import java.util.Scanner;
public class task9
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    System.out.println("Enter 1 to sort only odd position\n"+"Enter 2 to sort only even position\n"+"Enter 3 to sort all");
    int z=sc.nextInt();
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
    }
    if(z<=3 && z>=1)
    {
      if(z==3)
      {
        for(int a=0;a<array.length;a++)
        {
          for(int b=0;b<array.length;b++)
          {
            if(array[a]>array[b])
            {
              int temp=array[a];
              array[a]=array[b];
              array[b]=temp;
            }
          }
        }
      }
      if(z==1)
      {
        for(int a=0;a<array.length;a=a+2)
        {
          for(int b=0;b<array.length;b=b+2)
          {
            if(array[a]>array[b])
            {
              int temp=array[a];
              array[a]=array[b];
              array[b]=temp;
            }
          }
        }
      }
      if(z==2)
      {
        for(int a=1;a<array.length;a=a+2)
        {
          for(int b=1;b<array.length;b=b+2)
          {
            if(array[a]>array[b])
            {
              int temp=array[a];
              array[a]=array[b];
              array[b]=temp;
            }
          }
        }
      }
    }
    for(int n=0;n<array.length;n++)
    {
      System.out.println(array[n]);
    }
    sc.close();
  }
}