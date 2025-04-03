package DSA.LinkedList; // Package declaration

public class LinkedList {

    static Node head; // Head node of the linked list
    private int size; // Variable to store size of the list

    // Constructor to initialize size
    LinkedList() {
        this.size = 0; // Initially, the list is empty
    }

    // Node class (static so it can be used without needing an instance of LinkedList)
    public static class Node {
        String data;
        Node next; // Pointer to the next node

        Node(String data) {
            this.data = data;
            this.next = null; // By default, next is set to null
        }
    }

    //------- Add First (Insert at Beginning) -------
    public void addFirst(String data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode;
            size++; // Increment size
            return;
        }
        newNode.next = head; // New node points to current head
        head = newNode; // Head is updated to new node
        size++; // Increment size
    }

    //------- Add Last (Insert at End) -------
    public void addLast(String data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) { // If the list is empty
            head = newNode;
            size++; // Increment size
            return;
        }
        Node currNode = head;
        while (currNode.next != null) { // Traverse to the last node
            currNode = currNode.next;
        }
        currNode.next = newNode; // Set last node's next to new node
        size++; // Increment size
    }

    //------- Print the Linked List -------
    public void printList() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) { // Traverse the list and print each node
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL"); // Indicate end of list
    }

    //------- Delete First (Remove First Node) -------
    public void deleteFirst() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        head = head.next; // Move head to the next node
        size--; // Decrease size
    }

    //------- Delete Last (Remove Last Node) -------
    public void deleteLast() {
        if (head == null) { // If the list is empty
            System.out.println("List is empty");
            return;
        }
        size--; // Decrease size
        if (head.next == null) { // If there is only one node
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) { // Traverse to second-last node
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null; // Remove reference to last node
    }

    //------- Reverse the Linked List -------
    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null; // Initialize to null

        while (curr != null) { // Traverse the list
            next = curr.next; // Store next node
            curr.next = prev; // Reverse the current node's pointer
            prev = curr; // Move prev to current node
            curr = next; // Move curr to next node
        }
        head = prev; // Update head to the new first node
    }

    // ----- Search for a specific integer value in the list -----
    public boolean search(int key) {
        Node curr = head;  // Start from the head node

        while (curr != null) {  // Traverse the list until the end (null)
            if (curr.data.equals(String.valueOf(key))) {  // Convert key to String before comparison
                return true;  // If found, return true
            }
            curr = curr.next;  // Move to the next node
        }
        return false;  // If the loop ends, the key was not found, return false
    }

    //------ To check if a cycle exists in the linked list ------
    public static boolean cycle() {
        Node slow = head;  // Slow pointer moves one step at a time
        Node fast = head;  // Fast pointer moves two steps at a time

        while (fast != null && fast.next != null) { // Ensure fast doesn't reach null
            slow = slow.next; // Move slow pointer one step forward
            fast = fast.next.next; // Move fast pointer two steps forward

            if (slow == fast) {  // If slow and fast pointers meet, a cycle exists
                return true;
            }
        }
        return false;  // If fast reaches the end, no cycle exists
    }

    //------- Get Size of the Linked List -------
    public int getSize() {
        return size; // Return the current size
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList(); // Create an instance of LinkedList

        // Adding elements
        list.addFirst("2");
        list.addFirst("1");
        list.printList(); // Output: is -> a -> NULL

        list.addLast("3");
        list.printList(); // Output: is -> a -> list -> NULL

        list.addFirst("0");
        list.printList(); // Output: This -> is -> a -> list -> NULL

        // Deleting elements
        list.deleteLast();
        list.printList(); // Output: This -> is -> a -> NULL

        list.deleteFirst();
        list.printList(); // Output: is -> a -> NULL

        // Printing the size of the list
        System.out.println("Size of the list: " + list.getSize()); // Output: 2

        // Reversing the list
        list.reverse();
        list.printList(); // Output: a -> is -> NULL

        // search in list
        System.out.println(list.search(1)); // Output: true
        System.out.println(list.search(3));  // Output: false

        System.out.println("Is cycyle: " + cycle());
    }
}