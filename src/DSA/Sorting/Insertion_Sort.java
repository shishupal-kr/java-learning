package DSA.Sorting;

public class Insertion_Sort {

    // Method to print array
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Method to perform insertion sort
    public static void insertionSort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0.i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int array[] = {7, 8, 3, 6, 1, 9, 2, 5};

        System.out.println("Before sorting:");
        printarr(array);

        insertionSort(array);

        System.out.println("After sorting:");
        printarr(array);
    }
}