class FootBallTeam extends Team{
  FootBallTeam(String a,String b){
  super(a,b);
  }
  public void getMascot(){
  System.out.println("our football team mascot name is "+super.mascot);
  }
  public String toString(){
  return "Our name is "+super.name+"\nWe play football";
  }
}