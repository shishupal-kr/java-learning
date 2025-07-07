package DSA.ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class MyArrayList {

    static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Swap
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Integer list
        ArrayList<Integer> list = new java.util.ArrayList<>();
        // String list
        ArrayList<String> list2 = new java.util.ArrayList<>();

        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list2.add("apple");
        list2.add("orange");
        list2.add("banana");

        // Print list
        System.out.println(list);

        // Get element
        System.out.println("get operation :" + list.get(2));
        System.out.println(list);

        // Remove element
        list.remove(2);
        System.out.println("remove operation :" + list);

        // Set element
        list.set(2, 5);
        System.out.println("set operation :" + list);

        // Check contains
        System.out.println("contain :" + list.contains(1));
        System.out.println("contain : " + list.contains(10));

        // Size of list
        System.out.println("size: " + list.size());

        // Print normally
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Print in reverse
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i) + " ");
        }

        // Swap elements
        System.out.println("Before swap: " + list);
        swap(list, 1, 2);
        System.out.println("After swap: " + list);

        // Sort ascending
        Collections.sort(list);
        System.out.println("after sort in asc(default): " + list);
        // Sort descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("after sort in desc: " + list);
    }
}
