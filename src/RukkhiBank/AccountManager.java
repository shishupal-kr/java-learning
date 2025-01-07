package RukkhiBank;
import java.io.*;
import java.util.HashMap;

public class AccountManager {

         static HashMap<String, Bank> accounts = new HashMap<>();

        static {
            // Load accounts at startup
            FileStorage.loadAccountsFromFile();
        }

        public static void addAccount(Bank account) {
            accounts.put(account.getAccountNumber(), account);
            FileStorage.saveAccountsToFile(accounts);
        }

        public static void deleteAccount(String accountNumber) {
            if (accounts.containsKey(accountNumber)) {
                accounts.remove(accountNumber);
                FileStorage.saveAccountsToFile(accounts);
            } else {
                System.out.println("Account not found.");
            }
        }

        public static Bank getAccount(String accountNumber) {
            return accounts.get(accountNumber);
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

    public static boolean accountExists(String accountNumber) {
        return false;
    }

    public static void loadAccountsFromFile() {
    }
}
