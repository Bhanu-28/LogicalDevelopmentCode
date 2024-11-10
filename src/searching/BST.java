package searching;

import java.util.Scanner;

public class BST {
    public static void main(String[] args){
        int[] arr = {10,20,56,80,100,200,1000};
        int[] sameArr = {10,10,10};
        int elementToFind = 56;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to find");
        int elementToFindInput = sc.nextInt();
        int length = sameArr.length;
        int index = searchElementInArray(sameArr,length,elementToFindInput);
        System.out.println(index);
    }
    static int searchElementInArray(int[] arr, int length, int elementToFindInput){
        int low = 0;
        int high = length-1;

        while(low<=high){       // 1,2,3,4,5 find 4
            int mid = (low+high)/2;
            if(arr[mid]==elementToFindInput){
                return mid;
            }
            else if(arr[mid]<elementToFindInput){
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
        return -1;
    }
}
