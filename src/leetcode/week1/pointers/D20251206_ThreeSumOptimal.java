package leetcode.week1.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D20251206_ThreeSumOptimal {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };

        int[] useCase1 = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> answer = triplet(useCase1);

        System.out.println("3 sum optimal approach : " + answer);
    }

    public static List<List<Integer>> triplet(int[] arr) {

        List<List<Integer>> storeAnswer = new ArrayList<>();
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {

            if (i != 0 && arr[i] == arr[i - 1])
                continue;
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = (arr[i] + arr[j] + arr[k]);
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    storeAnswer.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                }
            }
        }
        return storeAnswer;
    }
}
