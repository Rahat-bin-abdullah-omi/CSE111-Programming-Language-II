class SavingsAccount{
  static double annualInterestRate;
  private double savingsBalance;
  SavingsAccount(double a){
  savingsBalance=a;
  }
  public void modifyInterestRate(double a){
  annualInterestRate=a;
  }
  public void calculateMonthlyInterest(){
  savingsBalance=savingsBalance+(((annualInterestRate/12.0)/100)*savingsBalance);
  }
  public void printSavingBalance(){
  System.out.println(savingsBalance);
  }
}