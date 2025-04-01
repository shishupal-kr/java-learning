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