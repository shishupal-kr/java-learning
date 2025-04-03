package DSA.LinkedList;

public  class LinkedList2 {
    static Node head;  //head of the node

    public static class Node{
        int data;
        Node next;

      Node(int data){  //constructor
            this.data = data;
            this.next = null;
        }
    }

    public static boolean cycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; //+1
            fast = fast.next.next; // +2
            if(slow == fast) {
                return true;  // if cycle exist
            }
        }
        return false;  // if cycle not exist
    }

    public static void main(String[] args) {

       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = head;

        System.out.println(cycle());

    }
}
