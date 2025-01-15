package Math;
import java.util.Random;

public class random {
    public static void main(String[] args) {

        // Using Math.random()
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());

        // Random number in a range using Math.random()
        int min = 10, max = 50;
        int randomInRange = (int) (Math.random() * (max - min + 1)) + min;
        System.out.println("Random number between " + min + " and " + max + ": " + randomInRange);


        // Using Random class
        Random random = new Random();

        // Random integer
        System.out.println("Random integer: " + random.nextInt());
        System.out.println("Random integer: " + random.nextInt(10));

        // Random double
        System.out.println("Random double: " + random.nextDouble());

        // Random boolean
        System.out.println("Random boolean: " + random.nextBoolean());

        // Random float
        System.out.println("Random float: " + random.nextFloat());

        // Random long
        System.out.println("Random long: " + random.nextLong());


        System.out.println("digit: " + random.nextInt(9000)+1000);


        // Generate a random 4-digit number (between 1000 and 9999)
        long randomDigit = random.nextLong(1000000000);
        System.out.println("Random 4-digit number: " + randomDigit);
        System.out.println(String.format("10digit no. start with 0: %010d", randomDigit));


        // Random integer in a range
        int range = random.nextInt(max - min + 1) + min;
        System.out.println("Random integer between " + min + " and " + max + ": " + range);


    }
}