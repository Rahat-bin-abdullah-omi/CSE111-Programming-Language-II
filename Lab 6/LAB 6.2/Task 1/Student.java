public class Student{
  public String name;
  public static int numberOfStudents=3;
  
  public Student(){
  name ="default name";
  }
  public Student(String a){
  name =a;
  }
  public String getName(){
  return name;
  }
}