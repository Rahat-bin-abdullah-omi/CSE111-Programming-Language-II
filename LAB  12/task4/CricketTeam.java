public class CricketTeam extends Team{
  CricketTeam(String a,String b){
  super(a,b);
  }
  public String toString(){
  return "Our name is "+super.name+"\n"+"We play Cricket";
  }
  public void getMascot(){
    System.out.println("Our Cricket team mascot name is "+super.mascot);
  }
}