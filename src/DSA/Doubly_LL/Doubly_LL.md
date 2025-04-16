step-by-step guide for Doubly Linked List (DLL) operations in your preferred clean format:

⸻

🔹 Doubly Linked List Operations

Each node has:
	•	data
	•	prev (pointer to previous node)
	•	next (pointer to next node)

⸻

1️⃣ addFirst(data) – Insert at Beginning
 1 Create a new node with given data.
 2 Set newNode.next = head.
 3 Set newNode.prev = null.
 4 If head != null, set head.prev = newNode.
 5 Update head = newNode.

⸻

2️⃣ addLast(data) – Insert at End
 1 Create a new node with given data.
 2 Set newNode.next = null.
 3 If head == null:
  • Set newNode.prev = null.
  • Set head = newNode.
  • Return.
 4 Traverse to the last node (say last).
 5 Set last.next = newNode.
 6 Set newNode.prev = last.

⸻

3️⃣ removeFirst() – Delete from Beginning
 1 If head == null, list is empty.
 2 Update head = head.next.
 3 If head != null, set head.prev = null.

⸻

4️⃣ removeLast() – Delete from End
 1 If head == null, list is empty.
 2 If head.next == null, set head = null.
 3 Else, traverse to last node (say last).
 4 Set last.prev.next = null.

⸻

5️⃣ printForward() – Print Left to Right
 1 Set temp = head.
 2 While temp != null:
  • Print temp.data.
  • Move temp = temp.next.

⸻

6️⃣ printReverse() – Print Right to Left
 1 Traverse to the last node (say last).
 2 While last != null:
  • Print last.data.
  • Move last = last.prev.

⸻