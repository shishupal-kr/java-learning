package Conditional_statement;

public class nested_if {
    public static void main(String[] args) {

        int age = 20;
        int weight = 55;

        if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You are eligible to donate blood.");
            }
        }

    }
}
