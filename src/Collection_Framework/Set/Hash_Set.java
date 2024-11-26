package Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {
    public static void main(String[] args) {

        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");

        System.out.println(fruits);
        System.out.println(fruits.remove("Apple"));
        System.out.println("List of fruits : " + fruits);
        System.out.println("Size of fruits : " + fruits.size());
        System.out.println("Is fruits empty : " + fruits.isEmpty());
        System.out.println("Is fruits contains Mango : " + fruits.contains("Mango"));
    }
}
