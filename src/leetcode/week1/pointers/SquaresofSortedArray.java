package leetcode.week1.pointers;

public class SquaresofSortedArray {

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] squaresSortedArray = sortedArrayTwoPointerApproach(nums);
        for(int num : squaresSortedArray ){
            System.out.print(num+" ");
        }
    }

    public static int[] squaresOfSortedArray(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n ; i++){
            nums[i] = nums[i] * nums[i];
        }

        return nums;
    }

    public static int[] sortedArrayTwoPointerApproach(int[] nums){
        int n = nums.length;
        // Two pointers one at the start and one at the end.
        int start = 0;
        int end = n - 1;
        int[] res = new int[n];
        int resindex = n -1;

        // keep going until they cross the paths
        while(start<= end){
            int leftSquare = nums[start] * nums[start];
            int rightSquare = nums[end] * nums[end];

            if(leftSquare > rightSquare){
                res[resindex] = leftSquare;
                start ++;
            }else{
                res[resindex] = rightSquare;
                end --;
            }

            resindex --;

        }

        return res;
    }

}
