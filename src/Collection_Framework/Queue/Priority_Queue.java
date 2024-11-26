package Collection_Framework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(10);
        queue.add(20);

        System.out.println(queue);
        System.out.println("remove: " + queue.poll());
        System.out.println("look: " + queue.peek());
        System.out.println(queue);
        System.out.println("remove: " + queue.remove());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println(queue);

    }
}
