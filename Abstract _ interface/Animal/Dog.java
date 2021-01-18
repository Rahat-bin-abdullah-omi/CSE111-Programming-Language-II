public class Dog extends Animal{
  
  public Dog(String name, String color,String action){
    super(name,color,action);
  }
  public Dog(String name, String color){
    super(name,color,"Doing nothing");
  }
  public String toString(){
    return "A "+super.color+" "+super.name+" is "+super.action ;
  }
}