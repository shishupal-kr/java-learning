package Collection_Framework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
    public static void main(String[] args) {

        Queue<String> Animal = new LinkedList<>();
        Animal.add("cat");
        Animal.add("dog");
        Animal.add("bird");
        Animal.add("fish");
        System.out.println("list :" + Animal);
        System.out.println(Animal.peek());
        System.out.println(Animal.poll());
        System.out.println(Animal.element());
        System.out.println(Animal.remove());
        System.out.println(Animal.size());
        System.out.println(Animal.isEmpty());
        System.out.println(Animal);
    }
}
