package DSA;

public class LinkedList {

  Node head;
  private int size;

  //for getting size of list
    // marked by this // in code, where code for getsize
  LinkedList(){   //constructor of class for size in seperate
      this.size=0;
  }

    class Node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null; // By default, the next pointer is null
            size++; //
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
        newNode.next = head; //pointing toward current head
        head = newNode;  // Update head to point to the new node
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
            if(head == null){
                head = newNode;  // If list is empty, new node becomes head
                return;
        }
            Node currNode = head;
            while (currNode.next != null){
                currNode = currNode.next; // Traverse to the end
            }
            currNode.next = newNode;  // Link the new node at the end
    }

    //print
    public void printList() {
        //what if head is null
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        //Traverse and print the list
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    //delete first
    public void deleteFirst(){
        if(head == null){ //corner case, eg- what if list is empty
            System.out.println("list is empty");
            return;
        }
        size--; //
        head = head.next;
    }
    //delete last
    public void deleteLast(){
        if(head == null){ //corner case, eg- what if list is empty
            System.out.println("list is empty");
            return;
        }
        size--; //
        if(head.next == null){  //corner case
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){ //
      return size;
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

        list.deleteLast();

        list.addLast("LinkedList");
        list.printList();
        System.out.println(list.getSize());

    }
}
