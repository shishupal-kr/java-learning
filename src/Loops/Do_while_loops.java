package Loops;

public class Do_while_loops {
    public static void main( String[] args) {

        // while loop = excute block of code as long as it conditions remain true

        int i = 1; //start
        do{
            System.out.println(i);
            i++;  //steps
        }
        while(i <= 5); //end after work
        System.out.print("out of while loop body");
    }
}