package arrays.arraylist;

public class RemoveDuplicatesFromSortedArray {
	
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,4,4,4,5,5,5,6,6};
		
		int length = arr.length;
		
		printArray(arr,length);
		System.out.println("Length Before removing duplicates : "+length);
		int[] removeDuplicates = removeDuplicates(arr,length);
		
		printArray(removeDuplicates, removeDuplicates.length);
		
		System.out.println("Length after removing duplicates : "+removeDuplicates.length);
	}
	
	private static void printArray(int[] arr,int length) {
		
		
		for(int i = 0 ; i < length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	private static int[] removeDuplicates(int[] arr, int length) {
		
		if(length==0 || length == 1) {
			return arr;
		}
		
		int j = 0;
		
		for(int i = 0; i < length-1 ; i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		
		arr[j++] = arr[length-1];
		
		// Create new array of size j
	    int[] result = new int[j];
	    
	    for (int i = 0; i < j; i++) {
	        result[i] = arr[i];
	    }
		
		return result;
		
	}

}
