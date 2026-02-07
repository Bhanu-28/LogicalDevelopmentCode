package leetcode.week1.pointers;

import java.util.*;

public class D20250823_ThreeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("]");
        }
    }

    private static List<List<Integer>> triplet(int n, int[] arr) {
        Set<List<Integer>> setTriplet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        setTriplet.add(temp);
                    }
                }
            }
            System.out.println("Value of i : " + i);
        }
        return new ArrayList<>(setTriplet);
    }
}
