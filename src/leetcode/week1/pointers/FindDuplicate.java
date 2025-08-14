package leetcode.week1.pointers;

public class FindDuplicate {

    public static void main(String[] args) {

        int[] nums = {1,3,2,1,4};

        int repeatedNumber = findDuplicate(nums);

        System.out.println("repeated Number : "+repeatedNumber);
    }

    public static int findDuplicate(int[] nums){

        int n = nums.length;
        int[] freq = new int[n+1];
        for(int i = 0; i < n ; i++){
            if(freq[nums[i]] == 0){
                    freq[nums[i]] +=1;
            }else{
                return nums[i];
            }
        }
        return 0;
    }
}
