package Collection_Framework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_Queue {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addFirst(4);
        deque.addFirst(5);

        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());
        System.out.println(deque);
    }
}
