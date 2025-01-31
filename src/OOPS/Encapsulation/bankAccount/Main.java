package OOPS.Encapsulation.bankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000,"Shishupal"); // Initial balance: 1000

        System.out.println("BankAccount Holder Name: " + BankAccount.getAccountHolderName());

        // Access balance via getter
        System.out.println("Account Balance: " + account.getBalance());

        // Modify balance via setter
        account.deposit(500); // Deposit 500
        System.out.println("Updated Balance: " + account.getBalance());

        // Attempt an invalid deposit
        account.deposit(-300); // Won't change the balance


    }
}
