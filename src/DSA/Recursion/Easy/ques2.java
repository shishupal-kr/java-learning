package DSA.Recursion.Easy;
import java.util.Scanner;

public class ques2 {
    //method to print in ascending order
    public static void PrintNum(int n){
        if (n==6) {
            return;
        }
        System.out.println(n);
        PrintNum(n+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        PrintNum(n);
    }
}
