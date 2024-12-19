package DSA;

public class LinkedList {

    // Node class to represent each node in the list
    static class Node {
        int data;
        Node next;

        // Constructor to create a new node
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the list (first node)
    Node head;

    // Method to add a node at the end of the list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;  // If the list is empty, make the new node the head
        } else {
            Node temp = head;
            while (temp.next != null) {  // Traverse to the last node
                temp = temp.next;
            }
            temp.next = newNode;  // Add the new node to the end
        }
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method to find a node with a specific value
    public boolean find(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;  // Node found
            }
            temp = temp.next;
        }
        return false;  // Node not found
    }

    // Method to delete a node with a specific value
    public void delete(int key) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        // If the head node itself holds the value to be deleted
        if (head.data == key) {
            head = head.next;
            return;
        }

        // Search for the node to be deleted
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        // If the key was not found
        if (temp.next == null) {
            System.out.println("Node with value " + key + " not found.");
        } else {
            temp.next = temp.next.next;  // Bypass the node to delete it
        }
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // Save the next node
            current.next = prev;  // Reverse the current node's pointer
            prev = current;       // Move the pointers one step ahead
            current = next;
        }
        head = prev;  // The new head of the list is the last node
    }

    // Main method to test the Linked List operations
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        // Display the linked list
        System.out.println("Linked List:");
        list.display();

        // Find a node
        System.out.println("Is 20 present in the list? " + list.find(20));

        // Delete a node
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();

        // Reverse the linked list
        list.reverse();
        System.out.println("Reversed Linked List:");
        list.display();
    }
}