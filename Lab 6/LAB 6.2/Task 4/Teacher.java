public class Teacher{
  String name;
  String dpt;
  int index=1;
  String[] subject=new String[3];
  public Teacher(String a,String b){
    name=a;
    dpt=b;
  }
  public void addCourse(Course c){
    subject[index-1]=c.sub;
    index++;
  }
  public void printDetail(){
    System.out.println("========================");
    System.out.println("Name: "+name+"\n"+"Department: "+dpt);
    System.out.println("List of courses"+"\n"+"========================");
    for(int a=0;a<subject.length;a++){
      if(subject[a]!=null){
        System.out.println(subject[a]);
      }
    }
  }
} 
