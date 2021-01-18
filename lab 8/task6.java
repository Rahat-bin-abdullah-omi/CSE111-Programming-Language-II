import java.util.*;
class task6
{
  static int sum(int n)
  {
    int s,i,d;
    s=0;
    for(i=n;i!=0;i=i/10)
    {
      d=i%10;
      s=s+d*d;
    }
    return s;
  }
  public static void main(String[]args)
  {
    Scanner sn=new Scanner(System.in);
    int input=sn.nextInt();
    for(int p=0;p<input;p++)
    {
    int num,s;
    num=sn.nextInt();
    s=num;
    while(s>9)
    {
      s=sum(s);
    }
    if(s==1)
      System.out.println(num+" is happy number");
    else
      System.out.println(num+" is not happy number");
  }
}
}