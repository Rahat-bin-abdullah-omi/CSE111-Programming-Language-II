class CheckingAccount extends Account{
  public int numberOfAccount=0;
  
  CheckingAccount(){
    super(0);
    numberOfAccount++;
  }
  CheckingAccount(double a){
    super(a);
    numberOfAccount++;
  }
}