package arrays.prefixsum;

public class D20260325_PrefixSumRange {

    public static void main(String[] args) {


        /*
        Examples:
        Input  : arr[] = {10, 20, 10, 5, 15}
        Output : prefixSum[] = {10, 30, 40, 45, 60}
         */

        int[] arr = {10,20,30,40,0,10};
        System.out.println("Initial Array");
        printArray(arr);

        int[][] ops = {{0,3},{1,2},{2,4}};
        int[] sumArray = calculatePrefixSumArrayRange(arr,ops);

        System.out.println("prefix array sum of ranges given");
        printArray(sumArray);
    }

    public static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    /*
    This method for calculating length between i and j
     */
    public static int[] calculatePrefixSumArrayRange(int[] prefixSum,int[][] ops){

        int length = prefixSum.length;

        for(int i = 1; i < length; i++){
            prefixSum[i] = prefixSum[i-1] + prefixSum[i];
        }
        int[] sumArray = new int[ops.length];
        int sumInRange = 0;
        int counter = 0;
        for(int[] op : ops ){
            int i = op[0];
            int j = op[1];

            if(i == 0){
                sumInRange = prefixSum[j];
            }
            else{
                sumInRange = prefixSum[j] - prefixSum[i-1];
            }

            sumArray[counter] = sumInRange;
            counter++;

        }

        return sumArray;

    }
}
