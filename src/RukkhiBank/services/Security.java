package RukkhiBank.services;
import java.util.Scanner;

public class Security {
    private static final String Admin_Password= "shishupal"; // Use a secure password or environment variable.

    public static boolean verifyAdmin() {
        //Authentication
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admin Password: ");
        String password = sc.nextLine();

        // Replace "admin123" with a secure password
        if (Admin_Password.equals(password)) {
            System.out.println("Authentication successful!");
            return true;
        } else {
            System.out.println("Authentication failed. Access denied.");
            return false;
        }
    }
}