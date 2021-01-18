public class Dog extends Animal implements SoundSource{
  //public String name;
  public Dog(String newName){
    super(newName);
  }
  public void makeSound(){
    System.out.println(getName()+" is crying");
  }
}