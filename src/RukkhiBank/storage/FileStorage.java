package RukkhiBank.storage;

import RukkhiBank.models.BankAccount;

import java.io.*;
import java.util.HashMap;

import static RukkhiBank.services.AccountManager.accounts;

public class FileStorage {

    private static final String FILE_PATH = "/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt";


    // Load all accounts from file
    public static void loadAccountsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/shishupal/Coding/Learn Java/src/RukkhiBank/accounts.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 5) {
                    String accountNumber = parts[0];
                    String accountHolderName = parts[1];
                    String accountType = parts[2];
                    String email = parts[3];
                    double balance = Double.parseDouble(parts[4]);

                    BankAccount account = new BankAccount(accountHolderName, accountType, accountNumber, email, balance);
                    accounts.put(accountNumber, account);
                }
            }
            System.out.println("Accounts loaded successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("No previous accounts found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }
    }


    // Save all accounts to file in plain text format
    public static void saveAccountsToFile(HashMap<String, BankAccount> accounts) {
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
            for (BankAccount account : accounts.values()) {
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
}