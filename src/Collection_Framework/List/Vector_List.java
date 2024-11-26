package Collection_Framework.List;

import java.util.List;
import java.util.Vector;

public class Vector_List {
    public static void main(String[] args) {

        List<String> Fruit = new Vector<>();

        Fruit.add("Apple");
        Fruit.add("Banana");
        Fruit.add("Cherry");
        Fruit.add("orange");

        System.out.println(Fruit);
        System.out.println(Fruit.get(1));
        System.out.println(Fruit.indexOf("Cherry"));
        System.out.println(Fruit.lastIndexOf("orange"));
        System.out.println(Fruit.remove(1));
        System.out.println(Fruit.set(1, "kela"));
    }
}
