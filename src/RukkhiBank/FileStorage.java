package RukkhiBank;

import java.io.*;
import java.util.HashMap;

import static RukkhiBank.AccountManager.accounts;

public class FileStorage {

    private static final String FILE_PATH = "/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt";


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
            HashMap<String, Bank> accounts = (HashMap<String, Bank>) ois.readObject();
            ois.close();
            System.out.println("Accounts loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No previous accounts found. Starting fresh.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }
    }

    // Save all accounts to file in plain text format
    static void saveAccountsToFile(HashMap<String, Bank> accounts) {
        try {
            File file = new File("/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt");
            System.out.println("Saving accounts to: " + file.getAbsolutePath());

            // Create the file if it doesn't exist
            if (!file.exists()) {
                file.createNewFile();
            }

            // Use FileWriter and BufferedWriter to write the file as text
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            // Iterate over each account and write its details in a readable format
            for (Bank account : accounts.values()) {
                String accountData = account.getAccountNumber() + ","
                        + account.getAccountHolderName() + ","
                        + account.getAccountType() + ","
                        + account.getEmail() + ","
                        + account.getBalance();
                writer.write(accountData); // Write the account details as a comma-separated line
                writer.newLine();  // Move to the next line
            }

            writer.close();
            System.out.println("Accounts saved successfully in text format.");
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

    public static void deleteAccount(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            accounts.remove(accountNumber);
            saveAccountsToFile(accounts);
        } else {
            System.out.println("Account not found.");
        }
    }
}