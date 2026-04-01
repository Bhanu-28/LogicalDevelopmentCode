package arrays.prefixsum;

/*

Consider an array of size N with all initial values as 0.
Perform given 'm' add operations from index 'a' to 'b' and evaluate highest element
in array. An add operation adds 100 to all elements from index a to b (both inclusive).
 */
public class D20260326_PrefixSumAddElements {

    public static void main(String[] args) {
        /*
        Examples:
        Input  : arr[] = {10, 20, 10, 5, 15}
        Output : prefixSum[] = {10, 30, 40, 45, 60}
         */

        int[] arr = {0,0,0,0,0,0};
        System.out.println("Initial Array");
        printArray(arr);

        int[][] ops = {{0,3},{1,2},{2,4}};
        int sum = calculatePrefixSumArrayMax(arr,ops);

        System.out.println("Max sum of ranges given");
        System.out.println(sum);
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

/*

calculate prefix array sum
 */
    public static int calculatePrefixSumArrayMax(int[] prefixSum, int[][] ops){

        int length = prefixSum.length;

           for(int[] op : ops){
               int i = op[0];
               int j = op[1];

               prefixSum[i] +=100;
               prefixSum[j+1] -=100;
           }

           int max = 0;
           int runningSum = 0;
           for(int i=0; i< length; i++){
               runningSum += prefixSum[i];
               max = Math.max(max,runningSum);
           }

           return max;
    }
}
