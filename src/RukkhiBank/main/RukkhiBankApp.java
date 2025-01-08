package RukkhiBank.main;

import RukkhiBank.models.BankAccount;
import RukkhiBank.storage.RukkhiBankJdbc;
import java.util.Scanner;

import static RukkhiBank.services.Security.verifyAdmin;

public class RukkhiBankApp {

    private static final Scanner sc = new Scanner(System.in);

    // Create Account
    private static void createAccount() {
        sc.nextLine(); // Consume leftover newline
        System.out.println("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.println("Choose Account Type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        System.out.print("Enter your choice (1 or 2): ");

        String accountType;
        int choice = sc.nextInt();
        sc.nextLine();
        accountType = (choice == 1) ? "Savings" : (choice == 2) ? "Current" : "Savings";

        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.println("Enter Email: ");
        String email = sc.nextLine();

        System.out.println("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accountHolderName, accountNumber, accountType, email, initialBalance);

        if (RukkhiBankJdbc.insertAccount(account)) {
            System.out.println("Account created successfully!");
        } else {
            System.out.println("Failed to create account.");
        }
    }

    // Deposit
    private static void deposit() {
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        BankAccount account = RukkhiBankJdbc.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        if (amount > 0) {
            account.Deposit(amount);
            if (RukkhiBankJdbc.updateBalance(account)) {
                System.out.println("Deposit successful! New Balance: ₹" + account.getBalance());
            } else {
                System.out.println("Failed to update balance.");
            }
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw
    private static void withdraw() {
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        BankAccount account = RukkhiBankJdbc.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("Enter Amount to Withdraw: ");
        double amount = sc.nextDouble();

        if (amount > 0 && account.getBalance() >= amount) {
            account.Withdraw(amount);
            if (RukkhiBankJdbc.updateBalance(account)) {
                System.out.println("Withdrawal successful! New Balance: ₹" + account.getBalance());
            } else {
                System.out.println("Failed to update balance.");
            }
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // View Balance
    private static void viewBalance() {
        sc.nextLine();
        System.out.println("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        BankAccount account = RukkhiBankJdbc.getAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
        } else {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: ₹" + account.getBalance());
        }
    }

    // Delete Account
    private static void deleteAccount() {
        // Verify admin password before deleting
        if (!verifyAdmin()) {
            System.out.println("Invalid admin password. Deletion aborted.");
            return;
        }
        sc.nextLine();
        System.out.println("Enter Account Number to Delete: ");
        String accountNumber = sc.nextLine();

        if (RukkhiBankJdbc.deleteAccount(accountNumber)) {
            System.out.println("Account deleted successfully!");
        } else {
            System.out.println("Failed to delete account or account not found.");
        }
    }

    // Main Menu
    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n--- Rukkhi Bank ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. Delete Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> viewBalance();
                case 5 -> deleteAccount();
                case 6 -> {
                    System.out.println("Thank you for using Rukkhi Bank. Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}