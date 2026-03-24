package arrays;


public class D20260306_ArraysRotation_ConstantSpace {

	static int[] rotateArray(int[] arr, int positionToRotate , int length) {


		// Idea is to rotate one by one element.

		// To keep track of how many elements to move further.
		int p = 1;

		while(p<=positionToRotate){

			//store the first element in some temporary variable.
			int last = arr[0];
			for(int i = 0 ; i < length -1; i++){

				arr[i] = arr[i+1];


			}

			arr[length-1] = last;
			p++;
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
