import java.util.Scanner;
public class AccountTester{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    BankAccount acc1=new BankAccount();
    BankAccount acc2=new BankAccount();
    BankAccount acc3=new BankAccount();
    System.out.println("Enter name for Account 1: ");
    String name1=sc.nextLine();
    acc1.setName(name1);
    System.out.println("Enter Address for Account 1: ");
    String address1=sc.nextLine();
    acc1.setAddress(address1);
    System.out.println("Enter AccountID for Account 1: ");
    int accountID1=sc.nextInt();
    acc1.setAccountID(accountID1);
    System.out.println("Enter Balance for Account 1;");
    double balance1=sc.nextDouble();
    acc1.setBalance(balance1);
    
    sc.nextLine();
    System.out.println("Enter name for Account 2: ");
    String name2=sc.nextLine();
    acc2.setName(name2);
    System.out.println("Enter Address for Account 2: ");
    String address2=sc.nextLine();
    acc2.setAddress(address2);
    System.out.println("Enter AccountID for Account 2: ");
    int accountID2=sc.nextInt();
    acc2.setAccountID(accountID2);
    System.out.println("Enter Balance for Account 1;");
    double balance2=sc.nextDouble();
    acc2.setBalance(balance2);
    
    sc.nextLine();
    System.out.println("Enter name for Account 3: ");
    String name3=sc.nextLine();
    acc3.setName(name3);
    System.out.println("Enter Address for Account 3: ");
    String address3=sc.nextLine();
    acc3.setAddress(address3);
    System.out.println("Enter AccountID for Account 3: ");
    int accountID3=sc.nextInt();
    acc3.setAccountID(accountID3);
    System.out.println("Enter Balance for Account 3;");
    double balance3=sc.nextDouble();
    acc3.setBalance(balance3);
    
    System.out.println("========Information of Account 1========");
    System.out.println("Name: "+acc1.getName()+"\n"+"Address: "+acc1.getAddress()+"\n"+"Account ID: "+acc1.getAccountID()+"\n"+"Balance: "+acc1.getBalance()+"\n"+"Balance with Interest: "+acc1.addInterest());
    System.out.println("========Information of Account 2========");
    System.out.println("Name: "+acc2.getName()+"\n"+"Address: "+acc2.getAddress()+"\n"+"Account ID: "+acc2.getAccountID()+"\n"+"Balance: "+acc2.getBalance()+"\n"+"Balance with Interest: "+acc2.addInterest());
    System.out.println("========Information of Account 3========");
    System.out.println("Name: "+acc3.getName()+"\n"+ "Address: "+acc3.getAddress()+"\n"+"Account ID: "+acc3.getAccountID()+"\n"+"Balance: "+acc3.getBalance()+"\n"+"Balance with Interest: "+acc3.addInterest()); 
    sc.close();
    
  }
}