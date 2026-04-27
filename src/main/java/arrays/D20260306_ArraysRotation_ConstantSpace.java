package arrays;


public class D20260306_ArraysRotation_ConstantSpace {


	/*

	Store the first element in some temporary variable.
	Now iterate and do arr[i] = arr[i+1]

	and keep arr[length-1] = temp

	keep the above logic in while loop for multiple rotations till the position to rotate.
	
	
		Case 1: Small rotation
			d = 2, n = 100000
			→ O(2 × n) ≈ O(n)
			
			 Fine
	
	Case 2: Large rotation
			d = n
			→ O(n × n) = O(n²)
			
			 Very slow
	
	Good for small d, bad for large d

	Time Complexity: (n - 1) ≈ n times * d --> O(N * d)
	Auxiliary Space: O(1)
	 */

	static int[] rotateArray(int[] arr, int positionToRotate , int length) {


		// Idea is to rotate one by one element.

		// To keep track of how many elements to move further.
		int counter = 1;

		while(counter<=positionToRotate){

			//store the first element in some temporary variable.
			int tempElement = arr[0];
			for(int i = 0 ; i < length -1; i++){

				arr[i] = arr[i+1];


			}

			arr[length-1] = tempElement;
			counter++;
		}

		return arr;

	}


	// Function to print elements of array
	static void printTheArray(int arr[], int n)
	{
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		public static void main (String[] args) {
			int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
			int N = arr.length;
			int d = 2;

			// Function calling
			int[] rotatedArray = rotateArray(arr, d, N);

			printTheArray(rotatedArray,N);
		}
	}
//
//Time Complexity: O(N * d)
//Auxiliary Space: O(1)
