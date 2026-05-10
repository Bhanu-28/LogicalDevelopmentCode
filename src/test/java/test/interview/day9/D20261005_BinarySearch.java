package test.interview.day9;

public class D20261005_BinarySearch {
	
	
	public static void main(String[] args) {
		
		int[] arr = {5,10,100,20,50};
		int elementToFind = 1000;
		System.out.println(binarySearch(arr,elementToFind));
		
	}

	private static int binarySearch(int[] arr,int elementToFind) {
		int low = 0;
		
		int high = arr.length-1;
		
		int mid = (low+high)/2;
		
		while(low<=high){
			if(arr[mid]<elementToFind) {
				low = mid+1;
			} else if(arr[mid] == elementToFind) {
				return mid;
			} else if(arr[mid] > elementToFind) {
				high = mid -1;
			}
			
			mid = (high + low )/2;
		}
		
		if(low > high) {
			return -1;	
		}
		
		return -1;
		
	}

}
