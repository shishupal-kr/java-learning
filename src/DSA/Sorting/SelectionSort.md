Selection sort is a simple sorting algorithm that works by repeatedly 
finding the smallest element from the unsorted portion of the array and swapping 
it with the first element of the unsorted portion. Here is a brief explanation:  

1.Divide the array:
The array is divided into two parts: sorted and unsorted.
2.Find the minimum: 
In each pass, find the minimum element from the unsorted portion.
3.Swap: 
Swap the found minimum element with the first element of the unsorted portion.
4.Repeat: 
Move the boundary between the sorted and unsorted portions 
one element to the right and repeat the process until the entire array is sorted.

Time Complexity
Best case: (O(n^2))
Worst case: (O(n^2))

Space Complexity
Space complexity: (O(1)) (in-place sorting)


Step-by-Step Explanation of Selection Sort:

Initial Array: [7, 8, 3, 1, 2]   

Step 1: i = 0
	1.	Assume index 0 is the smallest (7 is the smallest).
	2.	Compare 7 with the next element:
	•	Is 7 < 8? Yes → Do nothing; 7 is still smallest.
	3.	Compare 7 with 3:
	•	Is 7 > 3? Yes → Update smallest to index 2 (3 is now the smallest).
	4.	Compare 3 with 1:
	•	Is 3 > 1? Yes → Update smallest to index 3 (1 is now the smallest).
	5.	Compare 1 with 2:
	•	Is 1 < 2? Yes → Do nothing; 1 is still the smallest.
	6.	At the end of this pass, swap 7 with 1 (index 3).
Array after step 1: [1, 8, 3, 7, 2]

Step 2: i = 1
	1.	Assume index 1 is the smallest (8 is the smallest).
	2.	Compare 8 with 3:
	•	Is 8 > 3? Yes → Update smallest to index 2 (3 is now the smallest).
	3.	Compare 3 with 7:
	•	Is 3 < 7? Yes → Do nothing; 3 is still the smallest.
	4.	Compare 3 with 2:
	•	Is 3 > 2? Yes → Update smallest to index 4 (2 is now the smallest).
	5.	At the end of this pass, swap 8 with 2 (index 4).
Array after step 2: [1, 2, 3, 7, 8]

Step 3: i = 2
	1.	Assume index 2 is the smallest (3 is the smallest).
	2.	Compare 3 with 7:
	•	Is 3 < 7? Yes → Do nothing; 3 is still the smallest.
	3.	Compare 3 with 8:
	•	Is 3 < 8? Yes → Do nothing; 3 is still the smallest.
	4.	At the end of this pass, no swaps are needed.
Array after step 3: [1, 2, 3, 7, 8]

Step 4: i = 3
	1.	Assume index 3 is the smallest (7 is the smallest).
	2.	Compare 7 with 8:
	•	Is 7 < 8? Yes → Do nothing; 7 is still the smallest.
	3.	At the end of this pass, no swaps are needed.
Array after step 4: [1, 2, 3, 7, 8]

Final Array: [1, 2, 3, 7, 8]

Key Points:
	1.	Selection sort works by repeatedly finding the smallest element from the unsorted portion of the array and swapping it with the first element of the unsorted portion.
	2.	The algorithm divides the array into two parts: sorted and unsorted.
	3.	Time complexity: O(n²) due to the nested loops.
	4.	Space complexity: O(1) as sorting is performed in-place.