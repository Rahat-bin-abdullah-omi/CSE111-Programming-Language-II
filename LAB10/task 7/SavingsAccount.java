class SavingsAccount extends Account{

  SavingsAccount(String name,int id){
      super(name,id);
    super.type="savings";
  }
  void computeInterest (){
  super.balance=super.balance+((5.0/100.0)*super.balance);
  }
  void withdraw(double a){
    if(super.balance<a){
    System.out.println("Amount is more than balance");
    }
    else{
    System.out.println("Withdraw successful");
    super.balance=super.balance-a;
    }
  } 
}