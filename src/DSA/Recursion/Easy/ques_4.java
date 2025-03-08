package DSA.Recursion.Easy;

public class ques_4 {

    //method to print factorial of num
    public static int PrintFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact1 = PrintFact(n-1);
        int fact_n = n * fact1;
        return fact_n;
    }

    public static void main(String[] args) {

         int n = 5;
         int ans = PrintFact(n);
         System.out.println(ans);

    }
}
