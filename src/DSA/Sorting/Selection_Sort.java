package DSA.Sorting;

public class Selection_Sort {

    // Method to print the array
    public static void printarr(int array[]) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static void main(String[] args) {

        int array[] = {2, 6, 4, 5, 8, 1, 9, 3, 7};

        // Print the original array
        System.out.println("Before sorting");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Selection Sorting logic
        System.out.println("\nAfter sorting");
        for (int i = 0; i < array.length - 1; i++) {    // Loop for the passes
            int minIndex = i;    // Assume the current index has the smallest value
            for (int j = i + 1; j < array.length; j++) {    // Find the minimum element
                if (array[j] < array[minIndex]) {
                    minIndex = j;    // Update the index of the smallest element
                }
            }
            // Swap the smallest element with the first unsorted element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        // Print the sorted array
        printarr(array);
    }
}