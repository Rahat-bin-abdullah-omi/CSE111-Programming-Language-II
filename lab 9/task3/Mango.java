class Mango extends Fruit{
  Mango(){
  super(true,"Mango");
  }
  public String toString(){
  return super.getName()+"s are bad for you";
  }
}