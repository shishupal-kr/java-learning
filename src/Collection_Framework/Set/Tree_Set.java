package Collection_Framework.Set;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {

        Set<String> Apple = new TreeSet<>();
        Apple.add("Iphone");
        Apple.add("Ipad");
        Apple.add("Mac");
        Apple.add("Macbook");
        Apple.add("Iphone");

        System.out.println(Apple);
        System.out.println(Apple.remove("Iphone"));
        System.out.println(Apple);
        System.out.println("contain Iphone: " + Apple.contains("Iphone"));
        System.out.println(Apple.size());
        System.out.println(Apple.isEmpty());

    }
}
