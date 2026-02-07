package leetcode.week1.pointers;

import java.util.HashMap;
import java.util.Map;

/* problem 1 */
public class D20250807_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j > i && nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }

            }
        }

        return new int[] { target };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);

        for (int res : result) {
            System.out.println(res);
        }

        int[] numsHash = { 1, 2, 3, 4, 5, 6, 7 };
        int targetHash = 11;
        int[] resultHash = twoSumHash(numsHash, targetHash);

        for (int resHash : resultHash) {
            System.out.println(resHash);
        }
    }

    public static int[] twoSumHash(int[] numsArrray, int targetHash) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int length = numsArrray.length;

        for (int i = 0; i < length; i++) {
            int complement = targetHash - numsArrray[i];
            if (hashMap.containsKey(complement)) {
                return new int[] { hashMap.get(complement), i };
            }
            hashMap.put(numsArrray[i], i);
        }
        return new int[] {};
    }
}
