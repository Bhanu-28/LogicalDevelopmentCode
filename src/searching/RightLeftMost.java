package searching;

public class RightLeftMost {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 2, 2, 3, 3, 4, 5};
        int[] arr2 = {1,3,4,5,6,6};
        int key = 6;
        int res = leftMostElement(arr2, key);
        System.out.println(res);
    }

    private static int leftMostElement(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int leftIndex = -1;
        int rightIndex;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                leftIndex = mid;
                high = mid -1;
            }
            else if (arr[mid]<key){
                low = mid + 1;
                if(low==leftIndex){
                    leftIndex = low;
                }
            }
            else if (arr[mid] > key) {
                high = mid-1;
            }
        }
        return leftIndex;
    }
}


