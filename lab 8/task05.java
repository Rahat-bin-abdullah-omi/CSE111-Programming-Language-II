public class task05{
  public static void main(String[]args){
    String kisuShongkha = "74.5                89          \n    45";
    System.out.println
      (java.util.Arrays.toString(kisuShongkha.split("\\s+")));
    
    String golpo = "still you can find some teachers who dislike such co-curricular \n"+"activities like Programming Contests. They do not understand contests are\n"+"far more interesting and challenging than whatever slides he was showing in the classroom.\n"+"To be a good contestant, one needs to be resourceful."+"Apart from a working brain, the primary resource for a contestant would be books.\n"+"And a good source of books and training materials is the Internet.";
    System.out.println(java.util.Arrays.toString(golpo.split("\\s")));
   
    String s="23 3 8 20 32";
    String [] array =s.trim().split("\\s+");   
    int sum=0;
    for(int n=0;n<array.length;n++){
    int num=Integer.parseInt(array[n]);
    sum=sum+num;
    }
    System.out.println(sum);
  }
}



