package leetcode.week1.pointers;

import java.util.*;

public class ThreeSumTwoLoops {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};

        List<List<Integer>> triplet = triplet(arr);

        for(List<Integer> listInt : triplet){
            System.out.print("[");
            for(Integer it : listInt){
                System.out.print(it + " ");
            }
            System.out.print("]");
        }
        System.out.println();
    }


    public static List<List<Integer>> triplet(int[] arr){
            int length = arr.length;

        Set<List<Integer>> setTriplet = new HashSet<>();

        for(int i = 0 ; i < length ; i++){
            Set<Integer> setHashSet = new HashSet<>();
            for(int j = i + 1; j < length ; j++){
                int third = - (arr[i]+arr[j]);
                if(setHashSet.contains(third)){
                    List<Integer> tempList = Arrays.asList(arr[i],arr[j],third);
                    tempList.sort(null);
                    setTriplet.add(tempList);
                }
                setHashSet.add(arr[j]);
            }
        }

        List<List<Integer>> ans = new ArrayList<>(setTriplet);
        return ans;

    }
}
