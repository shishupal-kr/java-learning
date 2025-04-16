package DSA.Queue;

public class Queue_arr {
    int[] queue; // Array to store queue elements
    int front;  //first element in the queue
    int rear;   //last element in the queue
    int size;   // Tracks no of elements

    // Constructor
    public Queue_arr(int data){
        queue = new int[data]; // Initialize the queue array with specified size
        front = 0; // Set front index to 0
        rear = -1; // Set rear index to -1 indicating queue is empty
        size = 0; // Initialize size to 0
    }

    // ----- is full -----
    public boolean isFull(){
        return size == queue.length; // Returns true if size equals the length of the queue
    }

    //----- is empty -----
    public boolean isEmpty(){
        return size == 0; // Returns true if size is 0
    }

    // ----- Print -----
    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty"); // Notify if queue is empty
            return; // Exit the method
        }
        // Loop through elements based on size from front index
        for(int i = 0; i < size; i++) {
            System.out.println(queue[front + i]); // Print each element in the queue
        }
    }

    // ----- add from rear -----
    public void enqueue(int data){
        if (isFull()) {
            System.out.println("Queue is full"); // Notify if queue is full
            return; // Exit the method
        }
        rear = rear + 1; // Move rear pointer to the next position
        queue[rear] = data; // Insert the new element at the rear
        size++; // Increase the size of the queue
    }

    // ----- Removes from front -----
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty"); // Notify if queue is empty
            return -1; // Return default value when queue is empty
        }
        int current = queue[front]; // Get the front element
        front = front + 1; // Move front pointer to the next position
        size--; // Decrease the size of the queue
        return current; // Return the removed element
    }

    // ----- peek -----
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {

        Queue_arr q = new Queue_arr(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.print();

        System.out.println("After dequeue: ");
        q.dequeue();
        q.print();

        System.out.println("peek: " + q.peek());
    }
}
