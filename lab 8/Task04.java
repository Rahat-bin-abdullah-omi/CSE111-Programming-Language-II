import java.util.StringTokenizer;
public class Task04{
  public static void main(String[]args){
    String kisuShongkha = "74.5                89          \n    45";
    StringTokenizer k = new StringTokenizer(kisuShongkha);
    while(k.hasMoreElements()){
      System.out.println(k.nextElement());
    }
    
    String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
    StringTokenizer k2=new StringTokenizer(golpo);
    while(k2.hasMoreElements()){
      System.out.println(k2.nextElement());
    }
    
    String s="23 3 8 20 32";
    int sum=0;
    StringTokenizer k3=new StringTokenizer(s);
    while(k3.hasMoreElements()){
      int a=Integer.parseInt(k3.nextToken());
      sum=sum+(int)a;
    }
    System.out.println(sum);
  }
}





