package Test;
import java.util.Scanner;

public class test37 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        System.out.println("Reversed String: " + reversed);
    }
}
