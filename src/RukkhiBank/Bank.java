package RukkhiBank;
import java.io.*;

public class Bank implements Serializable {
    private String AccountHolderName;
    private String AccountNumber;
    private final String AccountType;
    private String Email;
    private double balance;

    public Bank(String AccountHolderName, String AccountNumber,
                String AccountType,String Email,double balance) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNumber = AccountNumber;
        this.balance = balance;
        this.AccountType = AccountType;
        this.Email = Email;
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

    //set Account details
    private void setAccountHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }
    private void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }
    private void setEmail(String Email){
        this.Email = Email;
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
        }else if(amount < balance){
            System.out.println("insufficient funds");
        }else{
            System.out.println("Invalid Amount!");
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + AccountHolderName);
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Account Type: " + AccountType);
        System.out.println("Current Balance: ₹" + balance);
    }
    public void put(String accountNumber, String accountName) {
    }

}