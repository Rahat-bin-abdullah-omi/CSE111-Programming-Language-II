public class SavingAccount{
  
static double annualInterestRate;
private double savingBalance;

SavingAccount(double a){
savingBalance=a;
}

public static void modifyInterestRate(double a){
annualInterestRate=a;
}

public void calculateMonthlyInterest(){
savingBalance=((annualInterestRate/12.0)/100)*savingBalance+savingBalance;
}

public void printSavingBalance(){
System.out.println(savingBalance);
}
}