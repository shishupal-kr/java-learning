package DSA.ArrayList;
import java.util.ArrayList;

public class Classroom {

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
    }
}
