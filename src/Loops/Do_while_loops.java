package Loops;

public class Do_while_loops {
    public static void main( String[] args) {

        // while loop = excute block of code as long as it conditions remain true

        int i = 2;
        do{
            System.out.println(i);
            i++;
        }
        while(i <= 5);{
            System.out.println(i);
            i++;
        }

        System.out.print("out of while loop body");
    }
}