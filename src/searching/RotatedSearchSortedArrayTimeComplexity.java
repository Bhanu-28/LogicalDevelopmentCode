package searching;

public class RotatedSearchSortedArrayTimeComplexity {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,1,2};
        int[] arr1 = {5,1,3};
        int[] arr2 = {4,5,6,7,8,1,2,3};
        int[] arr3 = {1,0,1,1,1};

        System.out.println(search(arr3,0));
    }

    static int search(int[] nums , int target){
        int low = 0;
        int high = nums.length-1;
        int mid;
        while(low<=high){
            mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[low]){
             /* if array of mid is greater than or equal to low
              then that part of array low to mid is sorted. */
                if(target>=nums [low]&&target<=nums [mid]){
                      high = mid - 1;
                    }
                else{
                    low = mid + 1;
                }
            }
            else {
                if(target>=nums [mid]&&target<=nums [high]){
                    low = mid + 1;
                }
                else {
                    high = mid -1;
                }
            }
        }
        return -1;
    }
    
}
