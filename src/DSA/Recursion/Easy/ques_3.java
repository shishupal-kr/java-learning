package DSA.Recursion.Easy;

public class ques_3 {

    //method to print sum of num from 1(i) to num.
    public static void PrintSum(int i,int num,int sum){
    if(i > num) {  //base case to stop
        System.out.println(sum);
        return;
    }
        sum += i;
        PrintSum(i + 1,num ,sum);
    }

    public static void main(String[] args) {

        PrintSum(1,5,0);
    }
}
