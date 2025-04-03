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

    // ------ to remove cycle in Linked List -----
    public static void remcycle() {
        // Step 1: Detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                cycle = true;
                break; // Cycle detected
            }
        }
        if (!cycle) return; // No cycle found, exit the function

        // Step 2: Find start of cycle
        slow = head;
        while (slow != fast) {
            slow = slow.next; //one steps move
            fast = fast.next; // one step move
        }

        // Step 3: Find last node in cycle and break the link
        Node prev = fast;
        while (prev.next != fast) {  // Find the last node before cycle starts
            prev = prev.next;
        }
        prev.next = null;  // Break the cycle
        System.out.println("cycle removed from LL");
    }

    public static void main(String[] args) {

       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = head;

        System.out.println(cycle());
        remcycle();
        System.out.println(cycle());

    }
}
