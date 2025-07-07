package DSA.Array;

public class myArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Traverse the array
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            // use num
        }

        // Search for a value (e.g., 30)
        int target = 30;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }
        }
        System.out.println("Is " + target + " found? " + found);

        // Find min, max, and sum
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
            sum += numbers[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);

        // Reverse the array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Sort the array
        java.util.Arrays.sort(numbers);
        System.out.println("Sorted array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
