package Operator;

public class Unary {
        public static void main(String[] args) {

            int a = 10;
            System.out.println("++a: " + (++a));  // Output: 11 (pre-increment)
            System.out.println("a++: " + (a++));  // Output: 11 (post-increment)
            System.out.println("a: " + a); // Output: 12
            System.out.println("--a: " + (--a));  // Output: 11 (pre-decrement)
            System.out.println("a--: " + (a--));  // Output: 11 (post-decrement)
            System.out.println("a: " + a); // Output: 10

        }
    }