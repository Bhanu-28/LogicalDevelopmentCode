package arrays.reverse;

public class D20260322_ReverseAnArray {


    public static void main(String[] args){

        int[] arr = {2000,100,0,1,2};


        reverseAnArrayExtraSpace(arr);

        int[] arr1 = {1,5,10,15,20,25,30,35,40};

        reverseAnArraysEfficient(arr1);

        int[] arrEven = {1,5,10,15,20,25,30,35,40,50};

        reverseAnArraysEfficient(arrEven);

        int[] arr2 = {10,9,8,7,6,5,4,3,2,1};

        reverseAnArraysRecursive(arr2,0,arr2.length-1);


        printArray(arr2);
    }


    /*

        Traverse from both ends.
        keep swapping until the middle of the array is reached.
        Time Complexity: O(N), where N is the number of elements in the array.

     */
    static int[] reverseAnArraysEfficient(int[] arr){

        int start = 0;
        int end = arr.length -1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }


        printArray(arr);
        return arr;
    }

    /*

        Same logic as efficient solution but recursive.
        Time Complexity: O(N), where N is the number of elements in the array.

     */

    static void reverseAnArraysRecursive(int[] arr, int start , int end){

         if(start >= end){
             return;
         }

         int temp = arr[start];
         arr[start] = arr[end];
         arr[end] = temp;

         reverseAnArraysRecursive(arr,start+1,end-1);

    }

    /*
        Idea is copy all the elements in a temp array\
        and copy the elements from the arr to temp array.
        return temp array.

        This method will take extra space in order of O(N).
     */
    static int[] reverseAnArrayExtraSpace(int[] arr){
        int length = arr.length;
        int[] temp = new int[length];

        for(int i = 0; i < length; i ++){
            temp[i] = arr[length -1 - i];
        }

        //copy the elements from temp to arr again
        printArray(temp);
        return temp;
    }

    private static void printArray(int[] arr){
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
}
