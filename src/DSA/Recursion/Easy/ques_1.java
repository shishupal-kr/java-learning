package DSA.Recursion.Easy;
import java.util.Scanner;

public class ques_1 {

    //method to print in descending order
    public static void PrintNum(int num){
        if(num == 0) {
            return;
        }
        System.out.println(num);
        PrintNum(num-1);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        PrintNum(num); //calling PrintNum method
    }
}
