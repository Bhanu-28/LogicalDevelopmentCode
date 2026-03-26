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

    Problem: Add 100 to positions 1, 2, 3.
    Array: [0, 0, 0, 0, 0]

    Normal way — just add 100 to each:
    [0, 0, 0, 0, 0]
          ↓ add 100 to index 1, 2, 3
    [0, 100, 100, 100, 0]
    Simple! But if range is 1 million elements → 1 million steps. Slow!

    Smart way — the trick 🎯
    Instead of adding 100 to every element, just write two numbers and let prefix sum do the heavy lifting.

    Write +100 at start (index 1)
    Write -100 at end+1 (index 4)
    D = [0, +100, 0, 0, -100]

    This method is useful

    If range is [0, 1000000] and you have 1000 operations → 1 billion steps! 🐌

    Time: O(m * n)   Space: O(1) (no extra array)


    Now : O(m + n) — fast

    One Line Summary
    Normal: Do the full work m times.
    Difference Array: Do tiny work (2 steps) m times, then 1 final pass. Much faster!

    You trade a little space for a massive speed boost!

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
