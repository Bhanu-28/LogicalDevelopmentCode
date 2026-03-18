package arrays;


public class D20260307_ArraysRotationJugglingAlgo {

	static int[] leftRotateArray(int[] arr,int positionToRotate , int length) {


		// To handle case where positionToRotate is greater than length of array.
		positionToRotate = positionToRotate % length ;

		int i , j , k , temp;

		int setsToDivide = gcd(positionToRotate,length);

		System.out.println("setsToDivide :"+setsToDivide);

		return arr;


	}

static int gcd(int a , int b ){

	if(b == 0){
		return a;
	}
	else{
		return gcd(b,a%b);
	}
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
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10 };
		int N = arr.length;
		int d = 2;

		// Function calling
		leftRotateArray(arr, d, N);
		PrintTheArray(arr, N);
	}
}

