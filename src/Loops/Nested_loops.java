package Loops;

// A loops inside a loop is known as loop

public class Nested_loops {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){

            for (int j = 0; j < i; j++){

                System.out.print(" #");
            }
            System.out.println();
        }
    }
}