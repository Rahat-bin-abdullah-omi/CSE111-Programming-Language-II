public class Account{
  String name;
  int id;
  String type;
  double balance;
  Account(){}
  Account(String name,int id){
    this.name=name;
    this.id=id;
  }
  void depAmount (double a){
  balance=balance+a;
  }
  void showBalance (){
  System.out.println(balance);
  }
  void computeInterest(){
    if(type=="savings"){
      balance=balance*(5.0/100.00);
    }
    else{
    System.out.println("no interest for current account holders");
    }
  }
  void withdraw (double a){
    if(type=="savings"){
      if(a>balance){
      System.out.println("Amount is more than balance");
      }
      else{
      System.out.println("withdraw successful");
      balance=balance-a;
      }
    }
    else if(type=="current"){
      if(a>balance){
      System.out.println("Amount is more than balance");
      }
      else if(balance-a<=500){
      System.out.println("You have to maintain minimum $500, can not withdraw");
      }
    }
  }
}