class sphere extends Point{
  sphere(double r){
    super(r);
    System.out.println("Creating a Sphere  done!");
  }
  @Override
  double space(){
  return Math.PI*(4.0/3.0)*getRadius()*getRadius()*getRadius();
  }
}