class CurrentAccount extends Account {
  
  public   CurrentAccount(String name1,int id){
       super(name1,id);
    super.type="current";
  }
  void computeInterest (){}
  
  void withdraw(double a){
    if(a>super.balance){
    System.out.println("Amount is more than balance");
    }
    else if(super.balance-a<=500){
    System.out.println("Unsuccessful ! You have to maintain minimum 500$ in your account");
    }
    else{
    System.out.println("Withdraw successfull");
    super.balance=super.balance-a;
    }
  }
}