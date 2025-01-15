package Math;

import java.util.Random;

public class random {
    public static void main(String[] args) {

        // 1. Using Math.random() - generates a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double random1 = Math.random();
        System.out.println("Math.random(): " + random1);

        // Generate random number in a specific range [min, max)
        int min = 10, max = 20;
        int randomInRange1 = (int) (Math.random() * (max - min) + min);
        System.out.println("Random number between " + min + " and " + (max - 1) + ": " + randomInRange1);

        // 2. Using Random class
        Random random = new Random();
        int randomInt = random.nextInt(); // Random integer
        System.out.println("Random integer (any range): " + randomInt);

        int randomInRange2 = random.nextInt(max - min) + min; // Random in range [min, max)
        System.out.println("Random integer between " + min + " and " + (max - 1) + ": " + randomInRange2);

        double randomDouble = random.nextDouble(); // Random double [0.0, 1.0)
        System.out.println("Random double: " + randomDouble);

        boolean randomBoolean = random.nextBoolean(); // Random boolean
        System.out.println("Random boolean: " + randomBoolean);


        // 4. Generate Random Number Using SecureRandom (For cryptography)
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        int secureRandomInt = secureRandom.nextInt(max - min) + min;
        System.out.println("SecureRandom - Random integer between " + min + " and " + (max - 1) + ": " + secureRandomInt);
    }
}