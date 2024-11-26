package Collection_Framework.Set;

import java.util.HashSet;
import java.util.Set;

public class LInkedHash_Set {
    public static void main(String[] args) {

        Set<String> fruit = new HashSet<>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Mango");
        fruit.add("Apple");

        System.out.println("List is print in order: "+ fruit);
        System.out.println("Size of fruits : " + fruit.size());
        System.out.println("Is fruits empty : " + fruit.isEmpty());
        System.out.println("Is fruits contains Mango : " + fruit.contains("Mango"));
        System.out.println("Remove Apple : " + fruit.remove("Apple"));
    }
}
