import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age :");
        int age = scanner.nextInt();

        if( age >= 50) {
            System.out.println("you are an old man!");
        }
        else if (age >= 18) {
                  System.out.println( "you are an adult!");
        }
        else if (age>= 13)  {
            System.out.println( "you are a teenager!");
        }
        else {
            System.out.println("You are not an adult!");
        }
    }
}
