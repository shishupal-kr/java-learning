package DSA.Recursion.Medium;
import java.util.Scanner;

public class hanoi {
    static int Steps = 0;

    //recursive function to solve problem
    public static void Hanoi(int n,String source,String helper, String destination) {

        //base case - If only one disk, move it directly from source to destination
        if(n==1){
            System.out.println("Move disk " + n + " from " + source + " to " + destination);
            Steps++;
            return;
        }
        //step 1 -Move n-1 disks from Source to Helper using Destination
        Hanoi(n-1,source,destination,helper);
        // Step 2: Move the nth disk from Source to Destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        Steps++;

        // Step 3: Move n-1 disks from Helper to Destination using Source
        Hanoi(n-1, helper, source, destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int num = sc.nextInt();

        Hanoi(num,"S","H","D");

        System.out.println("Total Steps: " + Steps);

    }
}
