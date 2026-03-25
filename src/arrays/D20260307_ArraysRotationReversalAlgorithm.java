package arrays;


public class D20260307_ArraysRotationReversalAlgorithm{

	public static void main(String[] args){

		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		int N = arr.length;

		int positionToRotate = 5;

		System.out.println("Before Rotation");

		printTheArray(arr,N);


		System.out.println("After Rotation");

		rotateUsingReverseAlgo(arr,N, positionToRotate);


		int[] arr1 = {1,2,3,4};

		int N1 = arr1.length;

		int positionToRotate1 = 1;


		rotateUsingReverseAlgo(arr1,N1, positionToRotate1);




	}

	static void rotateUsingReverseAlgo(int[] arr, int length, int positionToRotate){

		//first reverse d elements

		reverse(arr, 0 , positionToRotate-1);
		// next reverse the other elements.

		reverse(arr, positionToRotate , length-1);

		// reverse the whole array.

		reverse(arr, 0 , length -1);

		printTheArray(arr,length);

	}

	private static void reverse(int[] arr , int low , int high){

		while(low<high){

			// store the low in temp variable.
			int temp = arr[low];

			// now store the high in low
			arr[low] = arr[high];

			// store the value of temp in high
			arr[high] = temp;

			// increment low and decrement high.
			low++;
			high--;
		}
	}

	static void printTheArray(int[] arr, int length){

		for(int i = 0; i < length ; i ++){
			System.out.print(arr[i]+",");
		}

		System.out.println();

	}
}