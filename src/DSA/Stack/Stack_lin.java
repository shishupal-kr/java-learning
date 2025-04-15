package DSA.Stack;

public class Stack_lin {
   
    static class Node {
        int data; // Value stored in the node
        Node next; // Reference to the next node

        Node(int data) { // Constructor to initialize node
            this.data = data; // Set node's data
            this.next = null; // Initialize next as null
        }
    }

    static Node head = null; // Top of the stack

    // -----is empty -----
    public static boolean isEmpty() {
        return head == null; // Return true if head is null
    }

    // -----Push-----
    public static void push(int data) {
        Node newNode = new Node(data); // Create new node
        if (isEmpty()) { // Check if stack is empty
            head = newNode; // Set head if stack is empty
            return; // Exit method
        }
        newNode.next = head; // Point new node to current head
        head = newNode; // Update head to new node
    }

    //----- Pop -----
    public static int pop() {
        if (isEmpty()) { // Check if stack is empty
            return -1; // Return -1 if stack is empty
        }
        int top = head.data; // Get top element
        head = head.next; // Move head to next node
        return top; // Return popped element
    }

    // -----Peek-----
    public int peek() {
        if (isEmpty()) { // Check if stack is empty
            return -1; // Return -1 if stack is empty
        }
        return head.data; // Return top element
    }

    // ----- Recursively push at bottom -----
    public static void pushAtBottom(int data) {
        if (isEmpty()) { // Check if stack is empty
            push(data); // Push if stack is empty
            return; // Exit method
        }
        int top = pop(); // Pop top element
        pushAtBottom(data); // Recursive call to push at bottom
        push(top); // Push popped element back onto stack
    }

    // -----reverse -----
    public void reverse() {
        if (isEmpty()) { // Check if stack is empty
            return; // Exit method if empty
        }
        int top = pop(); // Pop top element & store it
        reverse(); // Recursive call to reverse the rest
        pushAtBottom(top); // Push popped element to bottom
    }

    //----- print -----
    public void print(){
        Node curr = head;
        if(head == null){
            System.out.println("list is empty");
        }
        while (curr != null) { // Traverse the list and print each node
            System.out.println(curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Stack_lin s = new Stack_lin(); // Create stack object
        s.push(1); // Push 1 onto stack
        s.push(2); // Push 2 onto stack
        s.push(3); // Push 3 onto stack
        s.print();

        System.out.println("After push at bottom: ");
        pushAtBottom(0);
        s.print();

        System.out.println("After reverse: ");
        s.reverse();
        s.print();

    }
}
