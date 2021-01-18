public class BankAccount{
  String name;
  String address;
  int accountID;
  double balance;
  double balanceWithInterest;
  public BankAccount(){
    name="default name";
    address="defoult address";
  }
  public void setName(String a){
    name=a;
  }
  public String getName(){
    return name;
  }
  public void setAddress(String a){
    address=a;
  }
  public String getAddress(){
    return address;
  }
  public void setAccountID(int a){
  accountID=a;
  }
  public int getAccountID(){
  return accountID;
  }
  public void setBalance(double a){
    balance =a;
  }
  public double getBalance(){
    return balance;
  }
  public double addInterest(){
    balanceWithInterest =balance*0.07+balance;
    return balanceWithInterest;
  }
}
