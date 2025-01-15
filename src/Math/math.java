package Math;

public class math{
        public static void main(String[] args) {

            // Constants
            System.out.println("PI: " + Math.PI);
            System.out.println("E: " + Math.E);

            // Absolute Value
            System.out.println("\nAbsolute value of -5: " + Math.abs(-5));

            System.out.println("\n-- Maximum and Minimum --");
            System.out.println("Max of 10 and 20: " + Math.max(10, 20));
            System.out.println("Min of 10 and 20: " + Math.min(10, 20));

            System.out.println("\n-- Power and Roots --");
            System.out.println("2^3: " + Math.pow(2, 3));
            System.out.println("Square root of 25: " + Math.sqrt(25));
            System.out.println("Cube root of 27: " + Math.cbrt(27));

            System.out.println("\n-- Exponential and Logarithms --");
            System.out.println("e^1: " + Math.exp(1));
            System.out.println("Log base e of 10: " + Math.log(10));
            System.out.println("Log base 10 of 100: " + Math.log10(100));

            System.out.println("\n-- Rounding --");
            System.out.println("Round 2.6: " + Math.round(2.6));
            System.out.println("Ceil of 2.3: " + Math.ceil(2.3));
            System.out.println("Floor of 2.9: " + Math.floor(2.9));

            System.out.println("\n-- Trigonometric Functions --");
            double angleDegrees = 45;
            double angleRadians = Math.toRadians(angleDegrees);
            System.out.println("Sine of 45 degrees: " + Math.sin(angleRadians));
            System.out.println("Cosine of 45 degrees: " + Math.cos(angleRadians));
            System.out.println("Tangent of 45 degrees: " + Math.tan(angleRadians));

            // Convert Radians to Degrees
            System.out.println("Radians to Degrees: " + Math.toDegrees(angleRadians));

            // Random Number
            System.out.println("Random number between 0.0 and 1.0: " + Math.random());
        }
}