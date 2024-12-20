package Conditional_statement;


//This is used when multiple conditions are checked sequentially.
public class if_else_if {
    public static void main(String[] args) {

        int marks = 75;  //you can also take input from user
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

    }
}
