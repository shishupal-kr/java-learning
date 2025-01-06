package RukkhiBank;

import java.io.*;
import java.util.HashMap;

public class AccountStorage {

    private static HashMap<String, Bank> accounts = new HashMap<>();
    private static final String AccountDetails = "/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt";

    // Add a new account
    public static void addAccount(Bank account) {
        accounts.put(account.getAccountNumber(), account);
        saveAccountsToFile(); // Save accounts to file after adding
    }

    // Retrieve an account by account number
    public static Bank getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    // Check if an account exists
    public static boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    // Remove an account (if needed in the future)
    public static void removeAccount(String accountNumber) {
        accounts.remove(accountNumber);
        saveAccountsToFile(); // Save accounts to file after removing
    }
    // Load all accounts from file
    public static void loadAccountsFromFile() {
        try {
            File file = new File("/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt");  // You can specify the path here if necessary
            System.out.println("Loading accounts from: " + file.getAbsolutePath());

            if (!file.exists()) {
                System.out.println("No previous accounts found. Starting fresh.");
                return;
            }

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            accounts = (HashMap<String, Bank>) ois.readObject();
            ois.close();
            System.out.println("Accounts loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No previous accounts found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }
    }
    // Save all accounts to file
    private static void saveAccountsToFile() {
        try {
            File file = new File("/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt");  // You can specify the path here if necessary
            System.out.println("Saving accounts to: " + file.getAbsolutePath());

            // Create the file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file,true));
            oos.writeObject(accounts);
            oos.close();
            System.out.println("Accounts saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }

    }


    public static void viewAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }

        System.out.println("--- List of All Accounts ---");
        for (Bank account : accounts.values()) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Name: " + account.getAccountHolderName());
            System.out.println("Account Type: " + account.getAccountType());
            System.out.println("Email: " + account.getEmail());
            System.out.println("Balance: ₹" + account.getBalance());
            System.out.println("----------------------------");
        }
    }

    /* public static void main(String[] args) {
        viewAllAccounts();
    } */
}
