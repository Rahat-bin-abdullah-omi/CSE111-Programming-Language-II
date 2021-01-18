class circle extends Point{
  public circle(double r){
    super(r);
    System.out.println("Creating a circle.....done!");
  }
  @Override
  double space(){
  return Math.PI*getRadius()*getRadius();
  }
}
