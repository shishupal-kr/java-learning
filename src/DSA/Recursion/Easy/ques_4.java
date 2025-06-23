package DSA.Recursion.Easy;
import java.util.Scanner;

public class ques_4 {

    //method to print factorial of num
    public static int PrintFact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        int fact1 = PrintFact(num - 1);
        int fact_n = num * fact1;
        return fact_n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();

         int result = PrintFact(num);
        System.out.println("Factorial of " + num + " is: " + result );
    }
}
