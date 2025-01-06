package RukkhiBank;

import java.util.Scanner;

public class Security {
    static boolean authenticateAdmin() {
        //Authentication
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Admin Password: ");
        String password = sc.nextLine();

        // Replace "admin123" with a secure password
        if ("shishupal".equals(password)) {
            System.out.println("Authentication successful!");
            return true;
        } else {
            System.out.println("Authentication failed. Access denied.");
            return false;
        }
    }
}
