package Collection_Framework.List;

import java.util.LinkedList;
import java.util.List;

public class Linked_List {
    public static void main(String[] args) {

        List<String> Fruits = new LinkedList<>();
        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Cherry");
        Fruits.add("orange");
        Fruits.add("kiwi");

        System.out.println(Fruits);

        Fruits.remove(1);
        Fruits.addFirst("kela");
        Fruits.addLast("mango");

        System.out.println(Fruits);

        System.out.println(Fruits.lastIndexOf("kela"));
        System.out.println("Contain or not: " + Fruits.contains("pomegranate"));
        System.out.println(Fruits.get(1));
        System.out.println(Fruits.set(1, "pomegranate"));
        System.out.println(Fruits.isEmpty());

    }
}
