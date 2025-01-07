package RukkhiBank.models;
import java.io.*;

public class BankAccount implements Serializable {
    private final String AccountHolderName;
    private final String AccountNumber;
    private final String AccountType;
    private final String Email;
    private double balance;

    public BankAccount(String AccountHolderName, String AccountNumber,
                       String AccountType, String Email, double balance) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.AccountType = AccountType;
        this.Email = Email;
        this.balance = balance;
    }

    //get Account Detail
    public String getAccountHolderName() {
        return AccountHolderName;
    }
    public String getAccountNumber() {
        return AccountNumber;
    }
    public String getAccountType() {
        return AccountType;
    }
    public String getEmail() {
        return Email;
    }
    public double getBalance() {
        return balance;
    }


    //features for bank to deposit/withdraw cash
    public void Deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("\nDeposited Successfully: ₹" + amount);
            System.out.println("To Account Number: " + AccountNumber);
            System.out.println("New Balance is: ₹" + balance);
        }else if(amount < 0){
            System.out.println("Invalid Amount! please Enter Amount Greater than 0.");
        }
        else{
            System.out.println("Invalid Amount! please Enter Numeric Value.");
        }
    }

    public void Withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            System.out.println("\nWithdrawn Successfully: ₹" + amount);
            System.out.println("From Account Number: " + AccountNumber);
            System.out.println("New Balance Amount is: ₹" + balance);
        }else if(amount > balance){
            System.out.println("insufficient funds");
        }else{
            System.out.println("Invalid Amount!");
        }
    }
}