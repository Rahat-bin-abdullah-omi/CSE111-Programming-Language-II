public class Account {
 private String name;
 private double balance;
 public static double interestRate = 5.0;
 public Account() {
  name = "Default Account";
  balance = 0.0;
 }
 public Account(String a, double b) {
  name = a;
  balance = b;
 }
 public String nameKi() {
  return name;
 }
 public double balanceKi() {
  return balance;
 }
 public void nameBoshao(String a) {
  name = a;
 }
 public void balanceBoshao(int a) {
  balance = a;
 }
 public void withdraw(double amount) {
  if (amount + 100 >= this.balance) {
   System.out.println("The account balance after deducting " + "withdraw amount is"
      +"equal to or less than minimum. Cannot withdraw");
  } else {
   balance -= amount;
   System.out.println("Withdraw successful! New balance is: " + this.balance);
  }
 }
}