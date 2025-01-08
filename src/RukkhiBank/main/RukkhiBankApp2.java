package RukkhiBank.main;
import RukkhiBank.services.AccountManager;
import RukkhiBank.models.BankAccount;
import RukkhiBank.storage.FileStorage;

import java.util.Scanner;
import static RukkhiBank.services.Security.verifyAdmin;

public class RukkhiBankApp2 {

    //single scanner for the entire class
    private static final Scanner sc = new Scanner(System.in);

    private static void CreateAccount() {
        sc.nextLine();
        System.out.println("Enter Account Name: ");
        String AccountName = sc.nextLine();
        // Choose Account Type
        System.out.println("Choose Account Type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.print("Enter your choice (1 or 2): ");

        String AccountType = "";
        int choice = sc.nextInt();
        sc.nextLine();
        // Set the account type based on user's choice
        switch (choice) {
            case 1:
                AccountType = "Savings";
                break;
            case 2:
                AccountType = "Current";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to 'Savings'.");
                AccountType = "Savings"; // Default option if invalid choice
        }
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
            //added this line
            FileStorage.saveAccountsToFile(AccountManager.accounts); // Save after deposit
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

    private static void deleteAccount() {
        // Verify admin password before deleting
        if (!verifyAdmin()) {
            System.out.println("Invalid admin password. Deletion aborted.");
            return;
        }

        // Prompting for account number
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        // Get the account to ensure it exists
        BankAccount account = AccountManager.getAccount(accountNumber);
        if (account == null) {
            System.out.println("Account not found! Please Enter Correct Account Number.");
            return;
        }



        // Call the deleteAccount method from AccountManager
        if (AccountManager.deleteAccount(accountNumber)) {
            System.out.println("Account Deleted: " + account.getAccountHolderName());
        } else {
            System.out.println("Account deletion failed.");
        }
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
                    deleteAccount();
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