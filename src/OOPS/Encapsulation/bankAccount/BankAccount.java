package OOPS.Encapsulation.bankAccount;

public class BankAccount {
    public static String AccountHolderName;
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance, String Name) {
        this.balance = initialBalance;
        this.AccountHolderName = Name;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }
    public static String getAccountHolderName() {
        return AccountHolderName;
    }

    // Setter method for balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
}