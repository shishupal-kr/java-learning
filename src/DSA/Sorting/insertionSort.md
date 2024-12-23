Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. 
It is much less efficient on large lists than more advanced algorithms 
such as quicksort, heapsort, or merge sort. Here is a brief explanation:  

1.Start with the second element: 
Assume the first element is already sorted.
2.Compare the current element with the sorted portion: 
Take the current element and compare it with elements in the sorted portion of the array.
3.Shift elements: 
If the current element is smaller than the compared element, shift the compared element one position to the right.
4.Insert the current element: 
Place the current element in its correct position in the sorted portion.
5.Repeat: 
Move to the next element and repeat the process until the entire array is sorted.

Time Complexity:
Best case:- (O(n)) (when the array is already sorted)
Worst case:- (O(n^2)) (when the array is sorted in reverse order)

Space Complexity
Space complexity: (O(1)) (in-place sorting)



Step-by-Step Explanation of Insertion Sort:

Initial Array: [7, 8, 3, 1, 2]

Step 1: i = 1
	1.	Assume That first element (7) is already sorted. Start with the second element (8).
	2.	Compare 8 with 7:
	•	Is 8 > 7? Yes → Do nothing; 8 is already in the correct position.
	3.	Array after step 1: [7, 8, 3, 1, 2]

Step 2: i = 2
	1.	Take the third element (3) as the key.
	2.	Compare 3 with 8:
	•	Is 3 < 8? Yes → Shift 8 to the right.
	3.	Compare 3 with 7:
	•	Is 3 < 7? Yes → Shift 7 to the right.
	4.	Place 3 in the correct position (index 0).
	5.	Array after step 2: [3, 7, 8, 1, 2]

Step 3: i = 3
	1.	Take the fourth element (1) as the key.
	2.	Compare 1 with 8:
	•	Is 1 < 8? Yes → Shift 8 to the right.
	3.	Compare 1 with 7:
	•	Is 1 < 7? Yes → Shift 7 to the right.
	4.	Compare 1 with 3:
	•	Is 1 < 3? Yes → Shift 3 to the right.
	5.	Place 1 in the correct position (index 0).
	6.	Array after step 3: [1, 3, 7, 8, 2]

Step 4: i = 4
	1.	Take the fifth element (2) as the key.
	2.	Compare 2 with 8:
	•	Is 2 < 8? Yes → Shift 8 to the right.
	3.	Compare 2 with 7:
	•	Is 2 < 7? Yes → Shift 7 to the right.
	4.	Compare 2 with 3:
	•	Is 2 < 3? Yes → Shift 3 to the right.
	5.	Compare 2 with 1:
	•	Is 2 > 1? Yes → Do nothing; place 2 in the correct position (index 1).
	6.	Array after step 4: [1, 2, 3, 7, 8]

Final Array: [1, 2, 3, 7, 8]

Key Points:
	1.	Insertion sort builds the sorted array one element at a time by comparing and shifting elements.
	2.	At each step, the left portion of the array is sorted, while the right portion is unsorted.
	3.	Time complexity:
	•	Best case (already sorted): O(n)
	•	Worst case (reverse sorted): O(n²)
	4.	Space complexity: O(1) as sorting is performed in-place.