package Learn_Array;
//import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        String[] brand = new String[4];
        brand[0] = "Apple";
        brand[1] = "Oneplus";
        brand[2] = "Realme";
        brand[3] = "motorola";

        brand[1]="skd";

        System.out.println(brand[1]);
        System.out.println(brand.length);

        for (int i = 0; i < brand.length; i++) {
            System.out.println(i);
        }



        //2nd type to make array
        int number[] = {12,23,45,67};
        System.out.println(number[2]);


    }
}