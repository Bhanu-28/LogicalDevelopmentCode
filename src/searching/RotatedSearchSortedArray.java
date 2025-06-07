package searching;


public class RotatedSearchSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0 ;
        System.out.println(search(nums,target));
        int[] nums1 = {7,8,9,1,2,3};
        int target1 = 0;
        System.out.println(search(nums1,target1));
        int[] nums3 = {1};
        int target2 = 0;
        System.out.println(search(nums3,target2));
        int[] nums5 = {1,2,3,4,5,1};
        int target5 = 1;
        System.out.println(search(nums5,target5));
        int[] nums4 = {1,2,3,4,5,6};
        int target3 = 2;
        System.out.println(binarySearch(nums4,0,nums4.length-1,target3));
        int[] bhanu = {3,4,5,6,7,1,2};
        int target6 = 1;
        System.out.println(search(bhanu,target6));
    }

      static int search(int[] nums, int target) {

          int n = nums.length;

          int pivot = findPivot(nums, 0, n - 1);


          if (nums[pivot] == target) {
              return pivot;
          }

              if (pivot == 0) {
                    //array is sorted.
                    return binarySearch(nums,0,n-1,target);
              }

              if(nums[0]<=target){
                    return binarySearch(nums,0,pivot-1,target);
              }
              else{
                  return binarySearch(nums,pivot+1,n-1,target);
              }
          }

     static int findPivot(int[] nums, int low, int high) {

        while(low<high){
            int mid = low + (high-low)/2;

            if(nums[low]<=nums[high]){
                //array is sorted return the pivot.
                return low;
            }

            if(nums[mid]>nums[high]){
                low = mid + 1;
            }

            else{
                high = mid;
            }
        }

    return low;
    }

    static int binarySearch(int[] nums,int low, int high, int target){


        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid -1;
            }
            else if(nums[mid] <=target){

                low = mid + 1 ;
            }
        }
        return -1;
     }


}
