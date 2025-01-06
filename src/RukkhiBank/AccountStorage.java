package RukkhiBank;

import java.util.HashMap;

public class AccountStorage {

    private static HashMap<String, Bank> accounts = new HashMap<>();

    // Add a new account
    public static void addAccount(Bank account) {
        accounts.put(account.getAccountNumber(), account);
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
            System.out.println("----------------------------");
        }
    }

    /* public static void main(String[] args) {
        viewAllAccounts();
    } */
}
