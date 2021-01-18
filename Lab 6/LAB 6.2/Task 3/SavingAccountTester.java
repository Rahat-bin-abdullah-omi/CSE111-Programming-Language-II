public class SavingAccountTester{
  public static void main(String[]args){
  SavingAccount saver1=new SavingAccount(20000.00);
  SavingAccount saver2=new SavingAccount(30000.00);
  System.out.println();
  saver1.modifyInterestRate(4.2);
  saver2.modifyInterestRate(4.2);
  saver1.calculateMonthlyInterest();
  saver2.calculateMonthlyInterest();
  System.out.println("Balance with interest for saver1: ");
  saver1.printSavingBalance();
  System.out.println("Balance with interest for saver2: ");
  saver2.printSavingBalance();
  
  
  saver1.modifyInterestRate(5.5);
//  saver2.modifyInterestRate(5.5);
  saver1.calculateMonthlyInterest();
  saver2.calculateMonthlyInterest();
  System.out.println("Next month's Balance with interest for saver1: ");
  saver1.printSavingBalance();
  System.out.println("Next month's Balance with interest for saver2: ");
  saver2.printSavingBalance();

  }
}