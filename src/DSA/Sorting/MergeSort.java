package DSA.Sorting;

public class MergeSort {

    static Node head; // Head node of the linked list
    private int size; // Variable to store size of the list (currently unused)

    // Node class representing an element in the linked list
    public static class Node {
        int data; // Value of the node
        Node next; // Pointer to the next node

        Node(int data) {
            this.data = data; // Set data for the node
            this.next = null; // By default, next is set to null
        }
    }

    // Method to find the middle of the linked list
    public Node getMid(Node head) {
        Node slow = head; // Slow pointer moves one step at a time
        Node fast = head.next; // Fast pointer moves two steps at a time
        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }
        return slow; // Return the middle node
    }

    // Method to merge two sorted linked lists
    public Node merge(Node head1, Node head2){
        Node mergeLL = new Node(-1); // Dummy node to ease merging
        Node temp = mergeLL; // Temp pointer to build the new list
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1; // Append smaller node
                head1 = head1.next; // Move pointer ahead
                temp = temp.next; // Move temp forward
            } else {
                temp.next = head2; // Append smaller node
                head2 = head2.next; // Move pointer ahead
                temp = temp.next; // Move temp forward
            }
        }
        // Append remaining nodes from head1
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        // Append remaining nodes from head2
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next; // Return the merged list (excluding dummy node)
    }

    // Recursive merge sort function for linked list
    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: list with 0 or 1 node is already sorted
        }

        Node mid = getMid(head); // Find the middle of the list
        Node righthead = mid.next; // Start of the right half
        mid.next = null; // Break the list into two halves

        Node newLeft = mergeSort(head); // Recursively sort left half
        Node newRight = mergeSort(righthead); // Recursively sort right half

        return merge(newLeft, newRight); // Merge the sorted halves
    }

    // Method to print the linked list
    public static void printList(Node head) {
        Node temp = head; // Temporary pointer to traverse the list
        while (temp != null) {
            System.out.print(temp.data + " "); // Print each node
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Newline after printing list
    }

    public static void main(String[] args) {
        MergeSort list = new MergeSort(); // Create an instance of MergeSort

        // Create an unsorted linked list using static head
        head = new Node(1);
        head.next = new Node(5);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);

        printList(head); // Print original list
        head = list.mergeSort(head); // Sort the list
        printList(head); // Print sorted list
    }
}
