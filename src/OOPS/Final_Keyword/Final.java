package OOPS.Final_Keyword;

//final keyword is used to declare constants, prevent inheritance, and restrict method overriding.
// It can be applied to variables, methods, and classes.

public class Final {
    public static void main(String[] args) {

        final int SPEED_LIMIT = 100;     // Constant variable
        System.out.println("Speed Limit:  " + SPEED_LIMIT);

        // Error: Cannot assign a value to a final variable
        // SPEED_LIMIT = 120;
    }
}