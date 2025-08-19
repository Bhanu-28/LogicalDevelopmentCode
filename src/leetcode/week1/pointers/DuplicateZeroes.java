package leetcode.week1.pointers;

public class DuplicateZeroes {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};

        duplicateZeros(arr);
    }

    // Method to duplicate zeros in the array without using extra space
    public static void duplicateZeros(int[] arr) {
        int n = arr.length; // n is the length of the array
        int currentIndex = -1, futureIndex = 0;

        // Find the position from which we cannot shift numbers to the right anymore
        // without going out of bounds.
        while (futureIndex < n) {
            currentIndex++;
            // If the current element is zero, it will take two positions after duplication; otherwise, it takes one.
            futureIndex += (arr[currentIndex] == 0) ? 2 : 1;
        }

        int lastIndex = n - 1; // The last index we can write to in the array

        // If futureIndex goes beyond the array length, set the last element to zero,
        // as the last zero cannot be duplicated because it does not fit within the array boundary.
        if (futureIndex == n + 1) {
            arr[lastIndex--] = 0;
            currentIndex--; // Skip this zero as it's already been placed in the array
        }

        // Move through the array from the end and duplicate zeros when necessary.
        while (lastIndex >= 0) {
            arr[lastIndex] = arr[currentIndex]; // Copy current element

            System.out.println("Array of Last Index : "+arr[lastIndex]);

            // If the current element is zero, we need to duplicate it.
            if (arr[currentIndex] == 0) {
                arr[--lastIndex] = arr[currentIndex]; // Set the previous index to zero as well
            }

            // Move one position back in both, the array and the current index tracker.
            currentIndex--;
            lastIndex--;
        }
    }
}