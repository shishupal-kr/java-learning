package DSA.Queue;

public class Queue_lin {
    Node front;
    Node rear;

    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    //is Empty
    public boolean isEmpty(){
        return front == null;
    }

    //print
    void print(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    //enqueue
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear == null) {
           front = rear = newNode;
           return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return value;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    public static void main(String[] args) {
        Queue_lin nn = new Queue_lin();
        nn.enqueue(1);
        nn.enqueue(2);
        nn.enqueue(3);
        nn.enqueue(4);

        nn.print();
        nn.dequeue();
        nn.print();
    }
}
