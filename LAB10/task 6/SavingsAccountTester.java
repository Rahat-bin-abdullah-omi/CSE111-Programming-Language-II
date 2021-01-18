public class SavingsAccountTester{
  public static void main(String[]args){
    SavingsAccount saver1=new SavingsAccount(20000.00);
    SavingsAccount saver2=new SavingsAccount(30000.00);
    
    saver1.modifyInterestRate(4.2);
    saver1.calculateMonthlyInterest();
    saver2.calculateMonthlyInterest();
    System.out.println("Balace after adding Interest for Saver1:");
    saver1.printSavingBalance();
    System.out.println("Balace after adding Interest for Saver2:");
    saver2.printSavingBalance();
    
    saver1.modifyInterestRate(5.5);
    saver1.calculateMonthlyInterest();
    saver2. calculateMonthlyInterest();
    System.out.println("Next month's Balace after adding Interest for Saver1:");
    saver1.printSavingBalance();
    System.out.println("Next month's Balace after adding Interest for Saver2:");
    saver2.printSavingBalance();
  }
}