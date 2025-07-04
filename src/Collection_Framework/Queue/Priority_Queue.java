package Collection_Framework.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        // Add elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(10); // duplicate element
        queue.add(20); // duplicate element

        System.out.println("Initial queue: " + queue);

        // Remove and return the head of the queue (smallest element)
        System.out.println("Removed: " + queue.poll());

        // Look at the head of the queue without removing it
        System.out.println("Peek (next in queue): " + queue.peek());

        // Print current state after poll and peek
        System.out.println("Queue after poll and peek: " + queue);

        // Remove
        System.out.println("Removed: " + queue.remove());

        // queue size
        System.out.println("Queue size: " + queue.size());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Final state of queue before draining it
        System.out.println("Queue before draining: " + queue);

        // Draining the remaining elements in priority order
        System.out.print("Draining queue in order: ");
        while (!queue.isEmpty()) {
            // Remove and print each element in priority order
            System.out.print(queue.poll() + " ");
        }
        System.out.println(); // line break
    }
}
