public class AnimalTester{
  public static void main(String [] args){
    Animal dog1=new Dog("Dog","Black","Sitting");
    Animal dog2=new Dog("Dog","Brown");
    System.out.println(dog1);
    System.out.println(dog2);
    Animal dog3=new Dog("Dog","Brown");
    System.out.println(dog3.equals(dog2));
    System.out.println(dog3.equals(dog1));
  }
}