package Test;
import java.util.Scanner;

public class test33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int number = sc.nextInt(); // Example number
        int sum = 0;

                while (number > 0) {
                    int digit = number % 10; // Extract the last digit from input 25 % 10= 5
                    number /= 10; // Remove the last digit from input 25/10 = 2
                    sum += digit; // Add it to the sum
                }

                System.out.println("Sum of digits: " + sum);
    }
}
