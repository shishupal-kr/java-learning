package DSA.Doubly_LL;

public class Doubly_LL {
    public Node head;
    public Node tail;

    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {  //constructor
            this.data = data;
        }
    }

    //add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
           head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //add last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //remove first
    public void removeFirst(){
        if(head == null){
            System.out.println("dll is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    // remove last
    public void removeLast(){
        if(tail == null){
            System.out.println("dll is empty");
            return;
        }
        if(head == tail){
            head = tail = null;
        }else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    //print
    public void print(){
        if(head == null){
            System.out.println("DLL is Empty");
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Reverse the doubly linked list
    public void reverse() {
        Node current = head;
        Node temp = null;

        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // After loop, temp is at the node before new head
        if (temp != null) {
            head = temp.prev;
        }
    }


    public void main(String[] args) {

        Doubly_LL dll = new Doubly_LL();

        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);

        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
       dll.reverse();
        dll.print();
    }
}
