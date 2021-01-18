public class Vehicle2010{
  public int x;
  public int y;
  Vehicle2010(){
    x=0;
    y=0;
  }
  public void moveUp(){
    y++;
  }
  public void moveLeft(){
    x--;
  }
  public void moveDown(){
    y--;
  }
  public void moveRight(){
    x++;
  }
  public void moveUpperRight(){
    y++;
    x++;
  }
  public void moveUpperLeft(){
    y++;
    x--;
  }
  public void moveLowerRight(){
    y--;
    x++;
  }
  public void moveLowerLeft(){
    y--;
    x--;
  }
  public boolean equals(Vehicle2010 a){
    if(this.x==a.x && this.y==a.y){
    return true;
    }
    else{
    return false;
    }
  }
  public String toString(){
    return "("+x+","+y+")";
  }
}