package searching;

public class RotatedSearchSortedArrayTimeComplexity {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        System.out.println(search(arr,3));
    }

    static int search(int[] arr , int elementToSearch){
        int low = 0;
        int high = arr.length-1;
        int mid;
        int indexofElement;
        while(low<=high){
            mid = low + (high-low)/2;

            if(arr[mid]==elementToSearch){
                return mid;
            }
            else if(arr[mid]>=arr[low]){
             /* if array of mid is greater than or equal to low
              then that part of array low to mid is sorted. */
                if(elementToSearch>=arr[low]&&elementToSearch<=arr[mid]){
                    indexofElement = binarySearch(arr,low,mid,elementToSearch);
                    if(indexofElement!=-1){
                        return indexofElement;
                    }
                }
                    return binarySearch(arr,mid+1,high,elementToSearch);
            }
            else {
//                elementToSearch>=arr[mid] && elementToSearch <=arr[high]
                  return binarySearch(arr,mid+1,high,elementToSearch);
            }
        }
        return low;
    }

    static int binarySearch(int[] arr, int low, int high, int target) {

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
