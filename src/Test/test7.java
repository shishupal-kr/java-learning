package Test;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter your number: ");
        int num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
