package Test;
import java.util.Scanner;
public class test12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your 1st number: ");
        int  num = sc.nextInt();
        System.out.println("Enter your 2nd number: ");
        int  num2 = sc.nextInt();
        System.out.println("Enter your 3rd number: ");
        int  num3 = sc.nextInt();
        System.out.println("Enter your 4th number: ");
        int  num4 = sc.nextInt();
        System.out.println("Enter your 5rd number: ");
        int  num5 = sc.nextInt();

       float average = (num + num2 + num3 + num4 + num5) / 5;
       System.out.println(average);



    }
}
