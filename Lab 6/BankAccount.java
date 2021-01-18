public class BankAccount{
  private String name;
  private String address;
  private String accountID;
  private double balance;
  
  public BankAccount(){
    name="default name";
    address="default address";
  }
  public BankAccount(String n,String add,String id,double bal){
    name=n;
    address=add;
    accountID=id;
    balance=bal;
  }
  public String getName(){
    return name;}
  public void setName(String n){
    name=n;}
  public String getAccountID(){
    return accountID;}
  public void setAccountID(String i){
    accountID=i;}
  public String getAddress(){
    return address;}
  public void setAddress(String a){
    address=a;}
  public double getBalance(){
    return balance;}
  public void setBalance(double c){
    balance=c;}
  public void addInterest(){
    balance=balance*1.07;
  }
  public String toString(){
    return "name:"+name+"address:"+address+"accountID:"+accountID+"balance:"+ balance;
  }
}
