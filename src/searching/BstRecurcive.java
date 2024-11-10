package searching;

import java.util.Scanner;
public class BstRecurcive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1000,98230};
        int length = arr.length;
        Scanner sc = new Scanner(System.in);
        int elementtoFind = sc.nextInt();
        int low = 0;
        int high = length-1;
        int index = RecursiveFindOfElement(arr,low,high,elementtoFind);
        System.out.println(index);

    }

    private static int RecursiveFindOfElement(int[] arr, int low, int high, int elementtoFind) {
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid]==elementtoFind){
            return mid;
        }
        else if(arr[mid] > elementtoFind){
            return RecursiveFindOfElement(arr,low,mid-1,elementtoFind);
        }else{
            return RecursiveFindOfElement(arr,mid+1,high,elementtoFind);
        }
    }
}
