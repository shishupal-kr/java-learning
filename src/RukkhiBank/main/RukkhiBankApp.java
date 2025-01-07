package RukkhiBank.main;
import RukkhiBank.services.AccountManager;
import RukkhiBank.models.BankAccount;

import java.util.Scanner;
import static RukkhiBank.services.Security.verifyAdmin;

public class RukkhiBankApp {

    //single scanner for the entire class
    private static final Scanner sc = new Scanner(System.in);

    private static void CreateAccount() {
        sc.nextLine();
        System.out.println("Enter Account Name: ");
        String AccountName = sc.nextLine();
        System.out.println("Enter Account Type (Savings/Current: ");
        String AccountType = sc.nextLine();
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();
        System.out.println("Enter Email Id: ");
        String AccountBalance = sc.nextLine();

        double initialBalance = 0.0;
        // Check if the account number already exists
        if (AccountManager.accountExists(AccountNumber)) {
            System.out.println("Account with this number already exists. Try again.");
            return;
        }

        //Bank constructor S
        BankAccount Accounts = new BankAccount(AccountName,AccountNumber,AccountType, AccountBalance, initialBalance);
        AccountManager.addAccount(Accounts);

        System.out.println("Account Created Successfully: " + AccountName);
        System.out.println("Account Type : " + AccountType);
        System.out.println("Account Number : " + AccountNumber);
        System.out.println("Account Balance : " + AccountBalance);
    }

    //feature for user to deposit cash
    private static void Deposit() {
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();
        // Check if the account number already exists
        BankAccount account = AccountManager.getAccount(AccountNumber);
        if (account == null) {
            System.out.println("Account not found! Please Enter Correct Account Number.");
            return;
        }
        try {
            System.out.println("Enter Amount to Deposit: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            if (amount <= 0) {
                return;
            }
            // Deposit the amount into the account
            account.Deposit(amount);
        } catch (Exception e) {
            System.out.println("Invalid input. Please Numeric Value.");
        }
    }

    // feature for user to withdraw cash
    private static void Withdraw(){
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();

        // Check if the account number already exists
        BankAccount account = AccountManager.getAccount(AccountNumber);
        if (account == null) {
            System.out.println("Account not found! Please Enter Correct Account Number.");
            return;
        }
        try {
            System.out.println("Enter Amount to Withdrawal: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            if (amount <= 0) {
                return;
            }
            // Deposit the amount into the account
            account.Withdraw(amount);
        } catch (Exception e) {
            System.out.println("Invalid input. Please Numeric Value.");
        }
    }

    // feature for user to view balance
    private static void ViewBalance() {
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();

        // Check if the account number already exists
        BankAccount account = AccountManager.getAccount(AccountNumber);
        if (account == null) {
            System.out.println("Account not found! Please Enter Correct Account Number.");
            return;
        }
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: ₹" + account.getBalance());
    }

    private static void Exit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press any key to exit...");

        // Waiting for user input before exiting
        sc.nextLine();  // This reads the next line of input to simulate a "Press any key to exit"

        System.out.println("Exiting the Banking System... Goodbye!");
        System.exit(0);  // This will terminate the program
    }

    private static void DeleteAccount() {
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();

        // Check if the account number already exists
        BankAccount account = AccountManager.getAccount(AccountNumber);
        if (account == null) {
            System.out.println("Account not found! Please Enter Correct Account Number.");
            return;
        }
        // Admin verification step
        if (!verifyAdmin()) {
            System.out.println("Invalid admin password. Deletion aborted.");
            return;
        }

        AccountManager.deleteAccount(AccountNumber);
        System.out.println("Account Deleted Successfully: " + AccountNumber);
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
    }

    public static void main(String[] args) {

        // Load accounts from file
        AccountManager.loadAccountsFromFile();

        System.out.println("Welcome to ABC_Bank Banking System");
        boolean running = true;

        while (running) {
         System.out.println("   ---Main Menu---    ");
         System.out.println("Press 1. Create Account");
         System.out.println("Press 2. Deposit Cash");
         System.out.println("Press 3. Withdraw Cash");
         System.out.println("Press 4. View Balance");
         System.out.println("Press 5. Exit");
         System.out.println("Press 6. Delete Account");
         System.out.println("Enter your choice: ");

         //for selecting the choice of
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    CreateAccount();
                    break;
                case 2:
                    Deposit();
                    break;
                case 3:
                    Withdraw();
                    break;
                case 4:
                    ViewBalance();
                    break;
                case 5:
                    Exit();
                    break;
                case 6:
                    DeleteAccount();
                    //method for admin
                case 99:
                    if (verifyAdmin()) {
                        AccountManager.viewAllAccounts();
                    } else {
                        System.out.println("Unauthorized access attempt.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

}