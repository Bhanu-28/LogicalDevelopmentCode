package arrays.slidingwindow;

// apply sliding window topic here.
public class D20260323_SumOfKElements {


    public static void main(String[] args){



        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(sumOfKElements(arr,k));


        int[] arr1 = {100,200,300,400};
        int k1 = 5;
        System.out.println(sumOfKElements(arr1,k1));

        int[] arr2 = {100,200,300,400};
        int k2 = 2;
        System.out.println(sumOfKElements(arr2,k2));

    }

    /*
     * 
     * Naive solution
     */
    public static int maxSumNaive(int[] arr, int k) {
        int n = arr.length;
        
        // Edge case: if window size is larger than array
        if (n < k) {
            System.out.println("Invalid size");
            return -1;
        }

        // Initialize max_sum to the smallest possible value
        int max_sum = Integer.MIN_VALUE;

        // Outer loop: Iterate through each starting point of a block
        // Runs (n - k + 1) times
        // we do n-k because some times k can Exceed n results in arrayoutOfBoundException.
        for (int i = 0; i <= n - k; i++) {
            int current_sum = 0;

            // Inner loop: Calculate sum of the block starting at i
            // Runs k times
            for (int j = 0; j < k; j++) {
                current_sum += arr[i + j];
            }

            // Update max_sum if the current block's sum is larger
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }

    /*

        Find the Sum of K elements.
        using sliding window pattern.

        start from Zero and through the loop calculate first k elements sum.
        store that in a variable.

        step by step move window pane ahead by 1 unit.
        now instead of calculating whole sum again.
        just delete the block which is left in the left block.
        Add the block which is at the right added.

         */
    public static int sumOfKElements(int[] arr, int k){

        int window_sum = 0;

        
        int length = arr.length;
        if(k>length){
            return -1;
        }
        
        //calculate the sum of first k elements.
        for(int i = 0; i < k;i++){
            window_sum += arr[i];
        }

        int max_sum = window_sum;
        for(int i = k; i < length; i++){
            window_sum += (arr[i] - arr[i-k]);
            if(max_sum<window_sum){
                max_sum = window_sum;
            }

        }

        return max_sum;

    }

}
