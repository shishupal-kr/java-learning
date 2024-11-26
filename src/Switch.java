import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

// switch  statement that allow variable to tested for equality against a list of value
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day Name (1st letter capital) :");
        String day = sc.nextLine();

        switch (day) {
            case "Sunday":
                System.out.println("It is Sunday!");
                break;
            case "Monday":
                System.out.println("It is Monday!");
                break;
            case "Tuesday":
                System.out.println("It is Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It is Wednesday!");
                break;
            case "Thursday":
                System.out.println("It is Thursday!");
                break;
            case "Friday":
                System.out.println("It is Friday!");
                break;
            case "Saturday":
                System.out.println("It is Saturday!");
                break;
            default:
                System.out.println("That is not a day!");
        }
    }
}
