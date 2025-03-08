package DSA.Recursion.Easy;
import java.util.Scanner;

public class ques_1 {
    //method to print in descending order
    public static void PrintNum(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        PrintNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        PrintNum(n);
    }
}
