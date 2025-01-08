package RukkhiBank.storage;
import java.sql.*;

import RukkhiBank.models.BankAccount;

public class RukkhiBankJdbc2 {
    private static final String url = "jdbc:mysql://127.0.0.1:3306/RukkhiBank";  //enter DATABASE name here
    private static final String username = "rukkhibank";
    private static final String password = "bankofrukkhi";

    //method to get connection
    public static Connection getConnection() {
        try { //Loading Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Driver Not Found" + e.getMessage());
        }
        return null;
    }

    public static void fetchaccounts(){
        //query to be run here
        String query = ("SELECT * FROM BankAccount");

        System.out.println("--Details of Accounts in Rukkhi Bank--");

        try {   //creating connection
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            //printing of data
            while (result.next()) {
                String AccountNumber = result.getString("accountNumber");
                String AccountHolderName = result.getString("accountHolderName");
                String AccountType = result.getString("accountType");
                String Email = result.getString("email");
                double Balance = result.getDouble("balance");

                //creating object of BankAccount
                BankAccount account = new BankAccount(AccountHolderName,AccountNumber, AccountType, Email, Balance);
                System.out.println("\nAccount Holder Name: " + account.getAccountHolderName());
                System.out.println("Account Number: " + account.getAccountNumber());
                System.out.println("AccountType: " + account.getAccountType());
                System.out.println("Email: " + account.getEmail());
                System.out.println("Balance: " + account.getBalance());

            }
            connection.close();
            statement.close();
            result.close();

        } catch (Exception e) {
            System.out.println("Error while fetching accounts: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        fetchaccounts();
    }
}
