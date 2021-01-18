public class Vehicle{
  static int x;
  static int y;
  Vehicle(){
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
  public String toString(){
    return "("+x+","+y+")";
  }
}