package Operator;

public class Ternary {
        public static void main(String[] args) {
            int a = 10, b = 5;
            int result = (a > b) ? a : b;  // If a > b, result = a, otherwise result = b
            System.out.println("Result: " + result);  // Output: 10
        }
    }