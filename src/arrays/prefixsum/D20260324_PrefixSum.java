package arrays.prefixsum;

public class D20260324_PrefixSum {

    public static void main(String[] args) {


        /*
        Examples:
        Input  : arr[] = {10, 20, 10, 5, 15}
        Output : prefixSum[] = {10, 30, 40, 45, 60}
         */

        int[] arr = {10,20,30,40,0,10};
        System.out.println("Initial Array");
        printArray(arr);


        calculatePrefixSumArray(arr);

        System.out.println("prefix sum array");
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    /*

     function generates a prefix sum array for a given array arr[] of size N:
     */
    public static int[] calculatePrefixSumArray(int[] prefixSum){

        int length = prefixSum.length;

        for(int i = 1; i < length; i++){
            prefixSum[i] = prefixSum[i-1] + prefixSum[i];
        }

        return prefixSum;
    }
}
