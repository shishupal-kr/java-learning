package Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {

        Map<String,String> fruit = new HashMap<>();
        fruit.put("Apple","Red");
        fruit.put("Banana","Yellow");
        fruit.put("Orange","Orange");
        fruit.put("Grapes","Green");
        fruit.put(null,"Red");
        fruit.put("Pineapple","Yellow");
        fruit.put("Strawberry","Red");
        fruit.put("Watermelon","Red");

        System.out.println(fruit);
        System.out.println(fruit.get(null));
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsValue("Red"));
        System.out.println(fruit.size());
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.remove("Apple"));
        System.out.println(fruit);
    }
}
