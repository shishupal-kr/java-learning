package Collection_Framework.List;
import java.util.Stack;

public class Stack_List {
    public static void main(String[] args) {

        Stack<String> Fruit = new Stack<>();

        Fruit.push("Apple");
        Fruit.push("Banana");
        Fruit.push("Cherry");
        Fruit.push("orange");

        System.out.println(Fruit);
        System.out.println("pop last element: " + Fruit.pop()); //remove
        System.out.println(Fruit);
        System.out.println("peek last element: " + Fruit.peek()); //look
        System.out.println(Fruit);

        System.out.println(Fruit.search("Apple"));
        System.out.println(Fruit.peek());
        System.out.println(Fruit.get(0));
        System.out.println(Fruit.empty());
        System.out.println(Fruit.getLast());
        System.out.println(Fruit.getFirst());
    }
}