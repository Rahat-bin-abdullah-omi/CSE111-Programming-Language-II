public class Cat{ 
  public String color = "White"; 
  public String action = "sitting"; 
  public Cat(){}
  public Cat(String a){
    color=a;
  }
  public Cat(String a,String b){
    color=a;
    action=b;
  }
  public void changeColor(String a){
    color=a;
  }
  public void printCat(){
    System.out.println(color+" cat is "+action);
  }
} 
