package arrays;


public class D20260321_ArraysRotationJugglingAlgo {


	/*

	Time Complexity O(n)
	Space complexity O(1)
	 */
	static int[] leftRotateArray(int[] arr,int positionToRotate , int length) {


		// To handle case where positionToRotate is greater than length of array.
		positionToRotate = positionToRotate % length ;

		int i , j , k , temp;

		int g_c_d = gcd(positionToRotate,length); // length 15


		for(i =0 ; i < g_c_d; i++){

			// store the ith element in temp variable.
			temp = arr[i];

			// to keep track of i storing it in j
			j = i; // 0 // ---> keep going 5 sets while loop and array will get changed.

			//rotation logic.
			while(true){

				k = j + positionToRotate; //  0+10= 10 // 10 + 10 = 20 // 5 + 10 = 15
				if(k>=length){
					k = k - length; // -- // 20 -15 = 5 // 15-15 = 0
				}
				if(k==i){
					break; //-- // -- // break.
				}

				arr[j] = arr[k]; // 10, 5,
				j = k; // 10, 5 ,
			}

			arr[j] = temp; // arr[5] = 0 //

		}

		System.out.println("setsToDivide :"+g_c_d);
		PrintTheArray(arr, length);

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


		int arr1[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 , 9 , 10 , 11 , 12, 13 , 14};
		int N1 = arr1.length;
		int d1= 10;


		leftRotateArray(arr1,d1, N1);

	}
}

