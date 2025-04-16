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
        if(front == null){
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

    public static void main(String[] args) {
        Queue_lin nn = new Queue_lin();
        nn.enqueue(1);
        nn.enqueue(2);
        nn.enqueue(3);
        nn.enqueue(4);

        nn.print();
    }
}
