package DSA.ArrayList;
import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A"); //time complexity is O(1) time used to add A into list
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        list.get(2);
        System.out.println(list);

        list.remove("B");
        System.out.println(list);

        list.set(2, "Z");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
