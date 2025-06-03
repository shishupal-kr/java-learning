package DSA.ArrayList;
import java.util.Collections;

public class ArrayList {

    // Method to swap two numbers in the list
    static void swap(java.util.ArrayList<Integer> list, int idx1, int idx2) {
        // Step 1: Store the value at index1 in a temporary variable
        int temp = list.get(idx1);
        // Step 2: Replace index1 element with index2 element
        list.set(idx1, list.get(idx2));
        // Step 3: Replace index2 element with the value stored in temp
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Creating an ArrayList to hold Integer values
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        // Creating an ArrayList to hold String values
        java.util.ArrayList<String> list2 = new java.util.ArrayList<>();

        // Adding elements to the Integer ArrayList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // Adding elements to the String ArrayList
        list2.add("apple");
        list2.add("orange");
        list2.add("banana");

        // Printing the Integer ArrayList
        System.out.println(list);

        // Get operation: retrieves the element at index 2
        System.out.println("get operation :" + list.get(2));
        System.out.println(list);

        // Remove operation: removes the element at index 2
        list.remove(2);
        System.out.println("remove operation :" + list);

        // Set operation: replaces the element at index 2 with 5
        list.set(2, 5);
        System.out.println("set operation :" + list);

        // Contains method: checks whether the value 1 exists in the list
        System.out.println("contain :" + list.contains(1));
        // Checks whether the value 10 exists in the list
        System.out.println("contain : " + list.contains(10));

        // ArrayList size: returns the number of elements in the list
        System.out.println("size: " + list.size());

        // Print using loop: iterates through the list to print elements in normal order
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Reverse print using loop: iterates through the list to print elements in reverse order
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }

        // Swap: printing the list before swapping elements
        System.out.println("Before swap: " + list);
        // Swapping elements at index 1 and 2
        swap(list, 1, 2);
        // Printing the list after swapping elements
        System.out.println("After swap: " + list);

        // Sorting: sorting the list in ascending order (default)
        Collections.sort(list);
        System.out.println("after sort in asc(default): " + list);
        // Sorting the list in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("after sort in desc: " + list);
    }
}
