package DSA;

import java.util.Arrays;

public class Array {
  public static void main(String[] args){

    int[] list = new int[10];
    list[0] = 1;
    list[1] = 2;
    list[2] = 3;
    list[3] = 4;
    list[4] = 5;
    list[5] = 6;
    list[6] = 7;
    list[7] = 8;
    list[8] = 9;
    list[9] = 10;
    System.out.println(Arrays.toString(list));

    //or
    String[] fruit = {"apple","banana","orange","mango"};
    System.out.println(Arrays.toString(fruit));


    //best way to print is using loops
    for(int i=0; i <= list.length; i++);
    System.out.println(list);
  }
}
