package Conditional_statement;
import java.util.Scanner;

//In a nested if statement, an if statement is placed inside another if statement.
public class nested_if {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your Weight: ");
        int weight = sc.nextInt();

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to donate blood.");
            }
        }else{
            System.out.println("you are not eligible to donate blood");
        }

    }
}
