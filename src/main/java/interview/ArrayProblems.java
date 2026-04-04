package interview;

import java.util.*;

/**
 * ARRAY PROBLEMS - Frequently asked in coding rounds
 * Pattern: Most array problems use HashMaps, Two Pointers, or Sorting
 */
public class ArrayProblems {

    // =============================================
    // 1. TWO SUM - Find 2 numbers that add to target
    // Input: [2,7,11,15], target=9 → [0,1]
    // Pattern: HashMap (complement lookup)
    // =============================================
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    // =============================================
    // 2. SEPARATE ODD AND EVEN NUMBERS
    // Input: [1,2,3,4,5,6] → Evens: [2,4,6], Odds: [1,3,5]
    // =============================================
    public static void separateOddEven(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0)
                even.add(num);
            else
                odd.add(num);
        }
        System.out.println("   Even: " + even);
        System.out.println("   Odd:  " + odd);
    }

    // =============================================
    // 3. FIND DUPLICATES IN ARRAY
    // Input: [1,3,4,2,2,3] → [2,3]
    // Pattern: HashSet
    // =============================================
    public static List<Integer> findDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) { // add returns false if already exists
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }

    // =============================================
    // 4. FIND MAX AND SECOND MAX
    // Input: [5,2,8,1,9,3] → Max: 9, Second: 8
    // =============================================
    public static void findMaxSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("   Max: " + max + ", Second Max: " + secondMax);
    }

    // =============================================
    // 5. MOVE ALL ZEROS TO END
    // Input: [0,1,0,3,12] → [1,3,12,0,0]
    // Pattern: Two pointers
    // =============================================
    public static int[] moveZeros(int[] arr) {
        int nonZeroIndex = 0;
        // Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        // Fill remaining with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
        return arr;
    }

    // =============================================
    // 6. ROTATE ARRAY BY K POSITIONS (RIGHT)
    // Input: [1,2,3,4,5], k=2 → [4,5,1,2,3]
    // Pattern: Reverse trick
    // =============================================
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle k > n
        reverse(arr, 0, n - 1); // reverse entire array
        reverse(arr, 0, k - 1); // reverse first k
        reverse(arr, k, n - 1); // reverse remaining
        return arr;
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // =============================================
    // 7. MAXIMUM SUBARRAY SUM (Kadane's Algorithm)
    // Input: [-2,1,-3,4,-1,2,1,-5,4] → 6 (subarray [4,-1,2,1])
    // THIS IS A CLASSIC - memorize this pattern
    // =============================================
    public static int maxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    // =============================================
    // 8. FIND MISSING NUMBER (1 to N)
    // Input: [1,2,4,5,6], n=6 → 3
    // Pattern: Sum formula n*(n+1)/2
    // =============================================
    public static int findMissing(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr)
            actualSum += num;
        return expectedSum - actualSum;
    }

    // =============================================
    // 9. INTERSECTION OF TWO ARRAYS
    // Input: [1,2,2,1], [2,2,3] → [2]
    // =============================================
    public static List<Integer> intersection(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for (int num : a)
            set.add(num);
        for (int num : b) {
            if (set.contains(num))
                result.add(num);
        }
        return new ArrayList<>(result);
    }

    // =============================================
    // 10. SORT ARRAY OF 0s, 1s, 2s (Dutch National Flag)
    // Input: [2,0,1,2,0,1] → [0,0,1,1,2,2]
    // Pattern: Three pointers (low, mid, high)
    // =============================================
    public static int[] sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    // =============================================
    // MAIN
    // =============================================
    public static void main(String[] args) {
        System.out.println("=== ARRAY PROBLEMS ===\n");

        // 1. Two Sum
        System.out.println("1. Two Sum:");
        int[] result = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println("   [2,7,11,15], target=9 → " + Arrays.toString(result));

        // 2. Separate Odd/Even
        System.out.println("\n2. Separate Odd/Even:");
        System.out.println("   Input: [1,2,3,4,5,6]");
        separateOddEven(new int[] { 1, 2, 3, 4, 5, 6 });

        // 3. Find Duplicates
        System.out.println("\n3. Find Duplicates:");
        System.out.println("   [1,3,4,2,2,3] → " + findDuplicates(new int[] { 1, 3, 4, 2, 2, 3 }));

        // 4. Max and Second Max
        System.out.println("\n4. Max and Second Max:");
        System.out.print("   [5,2,8,1,9,3] → ");
        findMaxSecondMax(new int[] { 5, 2, 8, 1, 9, 3 });

        // 5. Move Zeros
        System.out.println("\n5. Move Zeros to End:");
        System.out.println("   [0,1,0,3,12] → " + Arrays.toString(moveZeros(new int[] { 0, 1, 0, 3, 12 })));

        // 6. Rotate Array
        System.out.println("\n6. Rotate Array:");
        System.out.println("   [1,2,3,4,5], k=2 → " + Arrays.toString(rotateArray(new int[] { 1, 2, 3, 4, 5 }, 2)));

        // 7. Kadane's Algorithm
        System.out.println("\n7. Maximum Subarray Sum (Kadane's):");
        System.out
                .println("   [-2,1,-3,4,-1,2,1,-5,4] → " + maxSubarraySum(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));

        // 8. Missing Number
        System.out.println("\n8. Find Missing Number:");
        System.out.println("   [1,2,4,5,6], n=6 → " + findMissing(new int[] { 1, 2, 4, 5, 6 }, 6));

        // 9. Intersection
        System.out.println("\n9. Array Intersection:");
        System.out.println("   [1,2,2,1] ∩ [2,2,3] → " + intersection(new int[] { 1, 2, 2, 1 }, new int[] { 2, 2, 3 }));

        // 10. Sort 0s, 1s, 2s
        System.out.println("\n10. Sort Colors (Dutch Flag):");
        System.out.println("   [2,0,1,2,0,1] → " + Arrays.toString(sortColors(new int[] { 2, 0, 1, 2, 0, 1 })));
    }
}
