package DSA.Sorting;

public class Bubble_Sort {

    //method to print array
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

      public static void main(String[] args) {

        int array[] = {2,6,4,5,8,1,9,3,7};

        //Normal array
        System.out.println("Before sorting");
        printarr(array);

        //Bubble sorting
        System.out.println("\nAfter sorting");
        for(int i =0; i<array.length-1; i++){    //to dismiss the last element
            for(int j=0; j<array.length-i-1; j++){    // -1-i avoid the sorted elements

                //compare the adjacent elements ,if u want array descending then change sign <
                if(array[j] > array[j+1]){

                    //swap arrray[j] and array[j+1]
                    int temp = array[j];   //temp variable to store the value
                    array[j] = array[j+1]; //replace array[j] if array[j+1] is greater
                    array[j+1] = temp;     //replace array[j+1] with temp
                }
            }
        }
        printarr(array);

      }
}