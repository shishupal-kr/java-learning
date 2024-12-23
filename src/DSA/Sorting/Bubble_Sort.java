package DSA.Sorting;

public class Bubble_Sort {

    //method to print array
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        }

    public static void main(String[] args) {

        int array[] = {2,6,4,5,8,1,9,3,7};

        //Normal array
        System.out.println("Before sorting");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }

        //Bubble sorting
        System.out.println("\nAfter sorting");
        for(int i =0; i<array.length-1; i++){    //to dismmis the last element
            for(int j=0; j<array.length-1-i; j++){    // -1-i avoid the sorted elements

                if(array[j] > array[j+1]){    //compare the adjacent elements
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
