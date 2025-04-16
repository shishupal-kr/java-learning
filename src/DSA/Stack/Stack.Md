Complete step-by-step guide for all major Stack operations using Linked List, in the same structured format you used earlier:

⸻

🔹 Stack Operations Using Linked List

1️⃣ isEmpty() – Check if Stack is Empty
 1 Check if head == null.
 2 If yes, return true.
 3 Else, return false.

⸻

2️⃣ push(data) – Insert at Top of Stack
 1 Create a new node with given data.
 2 Set newNode.next = head.
 3 Update head = newNode.

⸻

3️⃣ pop() – Remove from Top of Stack
 1 If head == null, stack underflow.
 2 Store poppedData = head.data.
 3 Update head = head.next.
 4 Return poppedData.

⸻

4️⃣ peek() – View Top Element
 1 If head == null, stack is empty.
 2 Return head.data.

⸻

5️⃣ printStack() – Display All Elements
 1 Set temp = head.
 2 While temp != null:
  • Print temp.data.
  • Move temp = temp.next.

⸻

6️⃣ reverse() – Reverse the Stack
 1 Initialize: prev = null, current = head.
 2 While current != null:
  • nextNode = current.next
  • current.next = prev
  • prev = current
  • current = nextNode
 3 Set head = prev.

⸻