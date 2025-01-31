package File_io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a number to divide: ");
            int x = scanner.nextInt();

            System.out.println("Enter a number to divide by: ");
            int y = scanner.nextInt();

            double z = (double) x / y;
            System.out.println("Result is: " + z);
        }
        catch (ArithmeticException e) { // Catch block for division by zero
            System.out.println("*You can't divide by 0*");
        }
        catch (InputMismatchException e) { // Catch block for invalid input type
            System.out.println("Please enter a number");
        }
        catch (Exception e) { // Catch block for any other exceptions
            System.out.println("Error");
        }
        finally {
            scanner.close();
            System.out.println("This will always print");
        }
    }
}
