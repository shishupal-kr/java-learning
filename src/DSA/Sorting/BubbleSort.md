Step-by-Step Explanation of Bubble Sort:

Initial Array: [7, 8, 3, 1, 2]

Pass 1:
	1.	Compare 7 and 8:
	•	Is 7 > 8? No → Do nothing.
	2.	Compare 8 and 3:
	•	Is 8 > 3? Yes → Swap 8 and 3.
	•	Array after swap: [7, 3, 8, 1, 2]
	3.	Compare 8 and 1:
	•	Is 8 > 1? Yes → Swap 8 and 1.
	•	Array after swap: [7, 3, 1, 8, 2]
	4.	Compare 8 and 2:
	•	Is 8 > 2? Yes → Swap 8 and 2.
	•	Array after swap: [7, 3, 1, 2, 8]
Array after Pass 1: [7, 3, 1, 2, 8]

Pass 2:
	1.	Compare 7 and 3:
	•	Is 7 > 3? Yes → Swap 7 and 3.
	•	Array after swap: [3, 7, 1, 2, 8]
	2.	Compare 7 and 1:
	•	Is 7 > 1? Yes → Swap 7 and 1.
	•	Array after swap: [3, 1, 7, 2, 8]
	3.	Compare 7 and 2:
	•	Is 7 > 2? Yes → Swap 7 and 2.
	•	Array after swap: [3, 1, 2, 7, 8]
Array after Pass 2: [3, 1, 2, 7, 8]

Pass 3:
	1.	Compare 3 and 1:
	•	Is 3 > 1? Yes → Swap 3 and 1.
	•	Array after swap: [1, 3, 2, 7, 8]
	2.	Compare 3 and 2:
	•	Is 3 > 2? Yes → Swap 3 and 2.
	•	Array after swap: [1, 2, 3, 7, 8]
Array after Pass 3: [1, 2, 3, 7, 8]

Pass 4:
	1.	Compare 1 and 2:
	•	Is 1 > 2? No → Do nothing.
	2.	Compare 2 and 3:
	•	Is 2 > 3? No → Do nothing.
Array after Pass 4: [1, 2, 3, 7, 8]

Final Array: [1, 2, 3, 7, 8]

Key Points:
	1.	Bubble Sort repeatedly swaps adjacent elements if they are in the wrong order.
	2.	After each pass, the largest unsorted element “bubbles up” to its correct position.
	3.	Time complexity:
	•	Best case (already sorted): O(n)
	•	Worst case (reverse sorted): O(n²)
	4.	Space complexity: O(1) as sorting is performed in-place.