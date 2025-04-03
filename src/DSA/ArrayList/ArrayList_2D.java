package DSA.ArrayList;
import java.util.ArrayList;

public class ArrayList_2D {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainlist.add(list2);

        System.out.println(mainlist);

        // Outer loop: Iterates through each sublist in mainlist
        for(int i = 0; i < mainlist.size(); i++) {
            // Inner loop: Iterates through each element in the current sublist
            for(int j = 0; j < mainlist.get(i).size(); j++) {
                System.out.print(mainlist.get(i).get(j) + " "); // Prints element with space
            }
            System.out.println(); // Moves to a new line after printing a sublist
        }

    }
}
