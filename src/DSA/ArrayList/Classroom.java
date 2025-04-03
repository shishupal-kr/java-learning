package DSA.ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class Classroom {

    //swap two number
    static void swap(ArrayList<Integer> list, int idx1, int idx2) {

        // Step 1: Store the value at index1 in a temporary variable
        int temp = list.get(idx1);
        // Step 2: Replace index1 element with index2 element
        list.set(idx1, list.get(idx2));
        // Step 3: Replace index2 element with the value stored in temp
        list.set(idx2, temp);
    }


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list2.add("apple");
       list2.add("orange");
       list2.add("banana");

        System.out.println(list);

        // get element
        list.get(2);
        System.out.println("get operation :" + list);

        // remove element
        list.remove(2);
        System.out.println("remove operation :" +list);

        // set element at index
        list.set(2, 5);
        System.out.println("set operation :" +list);

        //contains element
        System.out.println("contain :" + list.contains(1));
        System.out.println("contain : " + list.contains(10));

        //arraylist size
        System.out.println("size :" + list.size());

        //print using loop
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        //reverse of arraylist
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i) + " ");
        }

        //swap
        System.out.println("Before swap: " + list );
        swap(list,1,2);
        System.out.println("After swap: " + list );

        //sorting
        Collections.sort(list);
        System.out.println("after sort in asc(default): " + list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("after sort in desc: " + list);


    }
}
