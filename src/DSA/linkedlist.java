package DSA;

public class linkedlist {
    Node head;
    int data;

    // Node class element
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ----- method to addFirst in list -----
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // ----- method to addLast in list -----
    public void addLast(int data ){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //----- method to print the list -----
    public void print(){
        if(head == null){  // it check list is null or not
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");  //it print data until it get null
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // ------ method to delete first -----
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is Empty");
            return;
        }
        head = head.next;
    }

    //----- method to delete last -----
    public void deleteLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node last = head.next;
        Node secondlast = head;
        while(last.next != null){
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next = head;

        while (curr !=  null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.print();
        ll.reverse();
        ll.print();

    }
}
