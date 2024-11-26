package Test;
import java.util.Scanner;

public class test32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number here: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number here: ");
        int num2 = sc.nextInt();

        if (num1 == num2)
            System.out.printf("%d == %d\n", num1,num2);
        if (num1 != num2)
            System.out.printf("%d == %d\n", num1,num2);
        if (num1 < num2)
            System.out.printf("%d == %d\n", num1,num2);
        if (num1 > num2)
            System.out.printf("%d == %d\n", num1,num2);
        if (num1 <= num2)
            System.out.printf("%d == %d\n", num1,num2);
        if (num1 >= num2)
            System.out.printf("%d == %d\n", num1,num2);


    }
}
