public class AccountTester{
  public static void main(String[]args){
    CurrentAccount ca=new CurrentAccount("Mehedi",101);
    SavingsAccount sa=new SavingsAccount("Rafi",102);
    
    ca.depAmount(1000);
    sa.depAmount (2000); 
    System.out.println("Balance of current account holder");
    ca.showBalance();
    System.out.println("Balance of Saving account holder");
    sa.showBalance();
    
    ca.computeInterest ();
    sa.computeInterest ();
    System.out.println("After Calculating Interest of current account holder:");
    ca.showBalance();
    System.out.println("After Calculating Interest of savings account holder:");
    sa.showBalance();
    
    System.out.println("Withdrawing 400 from current account holder");
    ca.withdraw(400);
    System.out.println("Withdrawing 1000 from savings account holder");
    sa.withdraw(1000);
    System.out.println("After withdraw:");
    System.out.println("Balance of current account holder");
    ca.showBalance();
    System.out.println("Balance of savings account holder");
    sa.showBalance();
    
    System.out.println("Withdrawing 200 from current account holder");
    ca.withdraw(200);
    System.out.println("Withdrawing 600 from savings account holder");
    sa.withdraw(600);
    System.out.println("Balance of current account holder");
    ca.showBalance();
    System.out.println("Balance of savings account holder");
    sa.showBalance();
  }
}