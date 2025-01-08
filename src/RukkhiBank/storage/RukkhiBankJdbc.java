package RukkhiBank.storage;

import RukkhiBank.models.BankAccount;
import java.sql.*;

public class RukkhiBankJdbc {

    private static final String url = "jdbc:mysql://127.0.0.1:3306/RukkhiBank";  // Your database URL
    private static final String username = "rukkhibank"; // Your database username
    private static final String password = "bankofrukkhi"; // Your database password

    // Method to insert a new account into the database
    public static boolean insertAccount(BankAccount account) {
        String query = "INSERT INTO BankAccount (accountHolderName, accountNumber, accountType, email, balance) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, account.getAccountHolderName());
            statement.setString(2, account.getAccountNumber());
            statement.setString(3, account.getAccountType());
            statement.setString(4, account.getEmail());
            statement.setDouble(5, account.getBalance());

            return statement.executeUpdate() > 0; // Return true if the record is inserted
        } catch (SQLException e) {
            System.err.println("Error while inserting account: " + e.getMessage());
        }
        return false;
    }

    // Method to fetch an account by account number
    public static BankAccount getAccount(String accountNumber) {
        String query = "SELECT * FROM BankAccount WHERE accountNumber = ?";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, accountNumber);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                return new BankAccount(
                        result.getString("accountHolderName"),
                        result.getString("accountNumber"),
                        result.getString("accountType"),
                        result.getString("email"),
                        result.getDouble("balance")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error while fetching account: " + e.getMessage());
        }
        return null; // Return null if the account is not found
    }

    // Method to update the balance of an account
    public static boolean updateBalance(BankAccount account) {
        String query = "UPDATE BankAccount SET balance = ? WHERE accountNumber = ?";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setDouble(1, account.getBalance());
            statement.setString(2, account.getAccountNumber());

            return statement.executeUpdate() > 0; // Return true if the record is updated
        } catch (SQLException e) {
            System.err.println("Error while updating balance: " + e.getMessage());
        }
        return false;
    }

    // Method to delete an account by account number
    public static boolean deleteAccount(String accountNumber) {
        String query = "DELETE FROM BankAccount WHERE accountNumber = ?";
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, accountNumber);

            return statement.executeUpdate() > 0; // Return true if the record is deleted
        } catch (SQLException e) {
            System.err.println("Error while deleting account: " + e.getMessage());
        }
        return false;
    }
}