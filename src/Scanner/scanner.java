package Scanner;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("what is your name :");
        String name = sc.nextLine();

        System.out.println("How old are you :");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("your favourite food :");
        String Food = sc.nextLine();

        System.out.println("your name is :" + name);
        System.out.println("your age is :" + age );
        System.out.println("your favourite food is :" + Food);


    }
}