package leetcode.week1.pointers;

/*

Problem 80

 */
public class D20250814_RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 8, 8 };

        int length = removeDuplicates(nums);
        System.out.println("Length of index:" + length);
    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;

        for (int num : nums) {
            if (index < 2 || num != nums[index - 2]) {
                nums[index] = num;
                index++;
            }
        }

        return index;
    }
}
