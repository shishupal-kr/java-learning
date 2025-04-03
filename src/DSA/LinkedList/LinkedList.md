Complete Steps for LinkedList Operations in Java
⸻
🔹 Basic Operations

1️⃣ Add First (Insert at Beginning)
1.	Create a new node.
2.	Set newNode.next = head.
3.	Update head = newNode.

2️⃣ Add Last (Insert at End)
1.	Create a new node.
2.	If head == null, set head = newNode.
3.	Traverse to the last node.
4.	Set lastNode.next = newNode.

3️⃣ Print LinkedList
1.	Set temp = head.
2.	While temp != null:
•	Print temp.data.
•	Move temp = temp.next.

4️⃣ Delete First (Remove from Beginning)
1.	If head == null, return.
2.	Set head = head.next.

5️⃣ Delete Last (Remove from End)
1.	If head == null, return.
2.	If head.next == null, set head = null.
3.	Traverse to the second-last node.
4.	Set secondLast.next = null.

6️⃣ Search (Iterative)
1.	Set temp = head.
2.	While temp != null:
•	If temp.data == key, return true.
•	Move temp = temp.next.
3.	Return false.

7️⃣ Search (Recursive)
1.	Base case: If head == null, return false.
2.	If head.data == key, return true.
3.	Call recursively on head.next.

⸻

🔹 Advanced Operations

8️⃣ Insert at a Specific Position
1.	If position = 0, call addFirst().
2.	Traverse to pos-1 node.
3.	Create a new node and adjust next pointers.

9️⃣ Delete a Node at a Specific Position
1.	If position = 0, call deleteFirst().
2.	Traverse to pos-1 node.
3.	Update prev.next = prev.next.next.

🔟 Reverse a LinkedList (Iterative)
1.	Initialize prev = null, curr = head.
2.	While curr != null:
•	Store next = curr.next.
•	Reverse link: curr.next = prev.
•	Move prev = curr, curr = next.
3.	Set head = prev.

🔹 Reverse a LinkedList (Recursive)
1.	Base case: If head == null or head.next == null, return head.
2.	Reverse head.next.
3.	Adjust next pointers.

🔹 Find Middle of LinkedList
1.	Use slow & fast pointers:
•	Move slow = slow.next (1 step), fast = fast.next.next (2 steps).
•	When fast reaches null, slow is at the middle.

🔹 Detect Loop in LinkedList
1.	Use Floyd’s Cycle Detection Algorithm (Slow & Fast Pointers).
2.	If slow == fast at any point, a loop exists.

🔹 Remove Loop in LinkedList
1.	Detect loop using Floyd’s Algorithm.
2.	Move one pointer to head, another to meeting point.
3.	Move both one step at a time until they meet again.
4.	Set prev.next = null to break the loop.

🔹 Find Nth Node from the End
1.	Use Two Pointer Approach:
•	Move first pointer N steps ahead.
•	Move both first and second one step at a time.
•	When first reaches null, second is at the Nth node from the end.

🔹 Check if LinkedList is Palindrome
1.	Find the middle using slow & fast pointers.
2.	Reverse the second half.
3.	Compare the first half and reversed second half.

🔹 Merge Two Sorted LinkedLists
1.	Use Two Pointer Approach to merge them in sorted order.

🔹 Find Intersection Point of Two LinkedLists
1.	Use difference of node counts or two-pointer approach.

🔹 Remove Duplicates from a Sorted LinkedList
1.	Traverse the list and skip duplicate nodes (temp.next = temp.next.next).

⸻

⸻

Java Linked List - Step-by-Step Explanation

This README provides a detailed breakdown of a singly linked list implementation in Java. If you ever forget how it works, just go through the steps below to refresh your memory.

⸻

1. Understanding the Linked List Structure
   •	A Linked List is a linear data structure where each element (node) points to the next node in the sequence.
   •	Unlike arrays, linked lists are dynamic, meaning you don’t need to define a fixed size in advance.

Node Structure:

public static class Node {
String data;  // Stores the data
Node next;    // Pointer to the next node

    Node(String data) {
        this.data = data;
        this.next = null; // Initially, the next pointer is null
    }
}

📝 What happens here?
1.	Each node holds data and a next pointer.
2.	next is initially null because new nodes don’t have a connection yet.

⸻

2. Creating the Linked List

class LinkedList {
Node head;    // Points to the first node in the list
private int size;  // Tracks the number of elements in the list

    LinkedList() {
        this.size = 0;  // The list starts empty
    }
}

📝 What happens here?
1.	The head variable keeps track of the first node.
2.	The size variable keeps track of how many elements are in the list.

⸻

3. Inserting Elements

a) Adding at the Beginning (addFirst)

public void addFirst(String data) {
Node newNode = new Node(data); // Create a new node
newNode.next = head;  // Point the new node to the current head
head = newNode;  // Update head to the new node
size++;  // Increase the size of the list
}

📝 What happens step by step?
1.	A new node is created.
2.	It points to the current head.
3.	head is updated to newNode, making it the new first node.

Example:

list.addFirst("A");
list.addFirst("B");

Linked List Now:

B -> A -> NULL



⸻

b) Adding at the End (addLast)

public void addLast(String data) {
Node newNode = new Node(data);
if (head == null) {
head = newNode;
} else {
Node curr = head;
while (curr.next != null) { // Traverse to the last node
curr = curr.next;
}
curr.next = newNode;  // Link last node to new node
}
size++; // Increase size
}

📝 What happens step by step?
1.	If the list is empty, the new node becomes head.
2.	Otherwise, traverse to the last node.
3.	Update the last node’s next pointer to newNode.

Example:

list.addFirst("A");
list.addLast("B");

Linked List Now:

A -> B -> NULL



⸻

4. Deleting Elements

a) Delete First Node

public void deleteFirst() {
if (head == null) {
System.out.println("List is empty");
return;
}
head = head.next; // Move head to the next node
size--;  // Reduce size
}

📝 What happens step by step?
1.	If the list is empty, print "List is empty".
2.	Move head to the next node, effectively removing the first node.

Example:

list.addFirst("A");
list.addFirst("B");
list.deleteFirst();

Linked List Now:

A -> NULL



⸻

b) Delete Last Node

public void deleteLast() {
if (head == null) {
System.out.println("List is empty");
return;
}
if (head.next == null) { // Only one node case
head = null;
} else {
Node secondLast = head;
while (secondLast.next.next != null) { // Traverse to second-last node
secondLast = secondLast.next;
}
secondLast.next = null;  // Remove reference to last node
}
size--; // Reduce size
}

📝 What happens step by step?
1.	If the list is empty, print "List is empty".
2.	If there is only one node, set head = null.
3.	Otherwise, traverse to the second-last node and remove the last node.

Example:

list.addFirst("A");
list.addLast("B");
list.deleteLast();

Linked List Now:

A -> NULL



⸻

5. Printing the List

public void printList() {
if (head == null) {
System.out.println("List is empty");
return;
}
Node curr = head;
while (curr != null) {
System.out.print(curr.data + " -> ");
curr = curr.next;
}
System.out.println("NULL");
}

📝 What happens step by step?
1.	If the list is empty, print "List is empty".
2.	Traverse through the list, printing each node.

Example Output:

A -> B -> C -> NULL



⸻

6. Reversing the List

public void reverse() {
Node prev = null;
Node curr = head;
Node next = null;

    while (curr != null) {
        next = curr.next;  // Store next node
        curr.next = prev;  // Reverse current node's pointer
        prev = curr;  // Move prev forward
        curr = next;  // Move curr forward
    }
    head = prev; // Update head to new first node
}

📝 What happens step by step?
1.	Three pointers (prev, curr, next) are used to reverse the list.
2.	Iterate through the list and update the next pointers to point backward.
3.	Update head to prev, which is now the first node in the reversed list.

Example:

Before Reverse:

A -> B -> C -> NULL

After Reverse:

C -> B -> A -> NULL



⸻

7. Getting the Size

public int getSize() {
return size; // Return the current size
}

Example:

System.out.println(list.getSize());

Output:

3



⸻

8. Running the Code
   •	Save the code in a file LinkedList.java
   •	Compile & run:

javac LinkedList.java
java LinkedList



⸻

Final Thoughts

📌 Remember these steps when revising:
✔ Insertion (First/Last)
✔ Deletion (First/Last)
✔ Traversal (Print)
✔ Reverse
✔ Size Tracking

This README breaks down the logic step by step, so you can quickly recall how linked lists work in Java. 🚀

⸻

Would you like any additional explanations or modifications?