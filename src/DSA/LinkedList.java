package DSA;

public class LinkedList {

  Node head;

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        //making new node is head
        newNode.next = head; //pointing toward head
        head = newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
        }
            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
    }

    //print
    public void printList() {
        //what if head is null
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("This");
        list.printList();


    }
}
