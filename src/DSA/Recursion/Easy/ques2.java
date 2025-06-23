package DSA.Recursion.Easy;
import java.util.Scanner;

public class ques2 {

    //method to print in ascending order
    public static void PrintNum(int num){
        if (num == 20) { //break point
            return;
        }
        System.out.println(num);
        PrintNum(num+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        PrintNum(num);
    }
}
