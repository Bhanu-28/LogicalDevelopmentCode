package arrays;


public class D20260305_ArraysRotation {

static int[] rotateArray(int[] arr, int positionToRotate , int length) {

	// create a new temp array with length given.

	int[] tempArray = new int[length];

	int k = 0;

	// store the elements after position to rotate in the temp array.
	for (int i = positionToRotate ; i < length; i++) {
		tempArray[k] = arr[i];
		k++;
	}

	// Now store the elements rotated in the end of this temp array.

	for (int i = 0; i < positionToRotate; i++) {
		tempArray[k] = arr[i];
		k++;
	}


	// Now copy the temp array into main array;


	for (int i = 0; i < length; i++) {
		arr[i] = tempArray[i];
	}


	PrintTheArray(arr,length);

	return arr;

}


// Function to print elements of array
static void PrintTheArray(int arr[], int n)
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
		rotateArray(arr, d, N);

		leftRotate(arr, N, d);

		PrintTheArray(arr, N);
	}


	static int[] leftRotate(int arr[], int n , int d){

		// create an array of size d.

		int [] tempArray = new int[d];

		// now copy the elements u want to left rotate to the temp array.
		for(int i = 0 ; i < d ; i++){
			tempArray[i] = arr[i];
		}

		// Now left shift the elements.

		for(int i = d ; i < n ; i++){
			//Move the element from dth position i -d positions.
			arr[i-d] = arr[i];
		}

		// Now arrange the elements of temp array to this array.

		for(int i = 0 ; i < d ; i++){
			arr[n-d + i] = tempArray[i];
		}


		return arr;

	}
}






//// Function to rotate array
//static void Rotate(int arr[], int d, int n)
//{
//	// Storing rotated version of array
//	int temp[] = new int[n];
//
//	// Keeping track of the current index
//	// of temp[]
//	int k = 0;
//
//	// Storing the n - d elements of
//	// array arr[] to the front of temp[]
//	for (int i = d; i < n; i++) {
//		temp[k] = arr[i];
//		k++;
//	}
//
//	// Storing the first d elements of array arr[]
//	// into temp
//	for (int i = 0; i < d; i++) {
//		temp[k] = arr[i];
//		k++;
//	}
//
//	// Copying the elements of temp[] in arr[]
//	// to get the final rotated array
//	for (int i = 0; i < n; i++) {
//		arr[i] = temp[i];
//	}
//}
