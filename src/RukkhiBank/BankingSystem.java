package RukkhiBank;

import java.util.HashMap;
import java.util.Scanner;
import static RukkhiBank.Security.authenticateAdmin;

public class BankingSystem {

    private static void CreateAccount() {
        Scanner sc = new Scanner(System.in);
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
        if (AccountStorage.accountExists(AccountNumber)) {
            System.out.println("Account with this number already exists. Try again.");
            return;
        }

        //Bank constructor S
        Bank Accounts = new Bank(AccountName, AccountType,AccountNumber, AccountBalance, initialBalance);
        AccountStorage.addAccount(Accounts);

        System.out.println("Account Created Successfully: " + AccountName);
        System.out.println("Account Type : " + AccountType);
        System.out.println("Account Number : " + AccountNumber);
        System.out.println("Account Balance : " + AccountBalance);
    }

    private static void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();
    }
    private static void Withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();
    }
    private static void ViewBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        String AccountNumber = sc.nextLine();
    }
    private static void Exit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("press Any key to exit ");
        int a = sc.nextInt();
        System.out.println("Exit successfully");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to ABC_Bank Banking System");
        boolean running = true;

        while (running) {
        System.out.println("   ---Main Menu---    ");
        System.out.println("Press 1. Create Account");
        System.out.println("Press 2. Deposit Cash");
        System.out.println("Press 3. Withdraw Cash");
        System.out.println("Press 4. View Balance");
        System.out.println("Press 5. Exit");
        System.out.println("Enter your choice: ");


            Scanner sc = new Scanner(System.in);
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

                    //method for admin
                case 99:
                    if (authenticateAdmin()) {
                        AccountStorage.viewAllAccounts();
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