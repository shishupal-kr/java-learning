Complete step-by-step guide for Queue operations using Linked List, in the same style:

⸻

🔹 Queue Operations Using Linked List

Note: Use two pointers: front and rear.

⸻

1️⃣ isEmpty() – Check if Queue is Empty
 1 Check if front == null.
 2 If yes, return true.
 3 Else, return false.

⸻

2️⃣ enqueue(data) – Add to Rear (Insert Element)
 1 Create a new node with given data.
 2 If rear == null:
  • Set front = rear = newNode.
  • Return.
 3 Set rear.next = newNode.
 4 Update rear = newNode.

⸻

3️⃣ dequeue() – Remove from Front (Delete Element)
 1 If front == null, queue underflow.
 2 Store removedData = front.data.
 3 Update front = front.next.
 4 If front == null, set rear = null.
 5 Return removedData.

⸻

4️⃣ peek() – View Front Element
 1 If front == null, queue is empty.
 2 Return front.data.

⸻

5️⃣ printQueue() – Display All Elements
 1 Set temp = front.
 2 While temp != null:
  • Print temp.data.
  • Move temp = temp.next.

⸻

6️⃣ clear() – Remove All Elements
 1 Set front = rear = null.

⸻