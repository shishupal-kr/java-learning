Bubble sort is a simple sorting algorithm that repeatedly steps through the list, 
compares adjacent elements, and swaps them if they are in the wrong order. 
The process is repeated until the list is sorted. Here is a brief explanation:  

1.Compare Adjacent Elements: 
Start with the first two elements and compare them.
2.Swap if Necessary: 
If the first element is greater than the second, swap them.
3.Move to the Next Pair: 
Move to the next pair of elements and repeat the comparison and swap if necessary.
4.Repeat for Each Pass: 
Continue this process for each pair of adjacent elements until the end of the list.
5.Reduce the Range: 
After each pass, the largest element will have "bubbled up" to its correct position, 
so reduce the range of elements to be compared in the next pass.
6.Stop When Sorted: 
Repeat the passes until no swaps are needed, indicating that the list is sorted.

Time Complexity
Best case: (O(n)) (when the array is already sorted)
Worst case: (O(n^2)) (when the array is sorted in reverse order)
Space Complexity
Space complexity: (O(1)) (in-place sorting)



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