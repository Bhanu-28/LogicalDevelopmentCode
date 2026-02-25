package interview;

import java.util.*;

/**
 * SORTING & SEARCHING + STACK PROBLEMS
 * Know Binary Search pattern cold — it's asked everywhere
 */
public class SortingSearchingStack {

    // =============================================
    // SEARCHING
    // =============================================

    // 1. BINARY SEARCH (Iterative)
    // Input: sorted [1,3,5,7,9,11], target=7 → index 3
    // O(log n) — MUST know this
    // =============================================
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1; // not found
    }

    // =============================================
    // 2. FIND FIRST AND LAST OCCURRENCE
    // Input: [1,2,2,2,3,4], target=2 → [1, 3]
    // Pattern: Binary search twice (leftmost + rightmost)
    // =============================================
    public static int[] firstAndLast(int[] arr, int target) {
        return new int[] { findFirst(arr, target), findLast(arr, target) };
    }

    private static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return result;
    }

    private static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return result;
    }

    // =============================================
    // 3. SEARCH IN ROTATED SORTED ARRAY
    // Input: [4,5,6,7,0,1,2], target=0 → index 4
    // =============================================
    public static int searchRotated(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
                return mid;

            // Left half is sorted
            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }

    // =============================================
    // SORTING
    // =============================================

    // 4. BUBBLE SORT — Know it for explaining, don't use in production
    // O(n²) — repeatedly swap adjacent elements
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // optimization: already sorted
        }
        return arr;
    }

    // 5. MERGE SORT — O(n log n), stable, divide & conquer
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] L = new int[n1], R = new int[n2];
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    // =============================================
    // STACK PROBLEMS
    // =============================================

    // 6. VALID PARENTHESES
    // Input: "({[]})" → true, "({[})" → false
    // THE classic Stack problem
    // =============================================
    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                char top = stack.pop();
                if (c == ')' && top != '(')
                    return false;
                if (c == '}' && top != '{')
                    return false;
                if (c == ']' && top != '[')
                    return false;
            }
        }
        return stack.isEmpty();
    }

    // =============================================
    // 7. NEXT GREATER ELEMENT
    // Input: [4,5,2,10,8] → [5,10,10,-1,-1]
    // Pattern: Stack (monotonic decreasing)
    // =============================================
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

    // =============================================
    // 8. EVALUATE POSTFIX EXPRESSION
    // Input: "23*54*+" → 26 (2*3 + 5*4 = 6+20 = 26)
    // =============================================
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        for (char c : expr.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop(), a = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.pop();
    }

    // =============================================
    // MAIN
    // =============================================
    public static void main(String[] args) {
        System.out.println("=== SORTING, SEARCHING & STACK ===\n");

        // 1. Binary Search
        System.out.println("1. Binary Search:");
        System.out.println("   [1,3,5,7,9,11], target=7 → index " + binarySearch(new int[] { 1, 3, 5, 7, 9, 11 }, 7));
        System.out.println("   [1,3,5,7,9,11], target=4 → index " + binarySearch(new int[] { 1, 3, 5, 7, 9, 11 }, 4));

        // 2. First and Last Occurrence
        System.out.println("\n2. First and Last Occurrence:");
        System.out.println(
                "   [1,2,2,2,3,4], target=2 → " + Arrays.toString(firstAndLast(new int[] { 1, 2, 2, 2, 3, 4 }, 2)));

        // 3. Search Rotated
        System.out.println("\n3. Search in Rotated Sorted Array:");
        System.out
                .println("   [4,5,6,7,0,1,2], target=0 → index " + searchRotated(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));

        // 4. Bubble Sort
        System.out.println("\n4. Bubble Sort:");
        System.out.println(
                "   [64,34,25,12,22,11,90] → " + Arrays.toString(bubbleSort(new int[] { 64, 34, 25, 12, 22, 11, 90 })));

        // 5. Merge Sort
        System.out.println("\n5. Merge Sort:");
        int[] arr5 = { 38, 27, 43, 3, 9, 82, 10 };
        mergeSort(arr5, 0, arr5.length - 1);
        System.out.println("   [38,27,43,3,9,82,10] → " + Arrays.toString(arr5));

        // 6. Valid Parentheses
        System.out.println("\n6. Valid Parentheses:");
        System.out.println("   \"({[]})\" → " + isValidParentheses("({[]})"));
        System.out.println("   \"({[})\" → " + isValidParentheses("({[})"));
        System.out.println("   \"()[]{}\" → " + isValidParentheses("()[]{}"));

        // 7. Next Greater Element
        System.out.println("\n7. Next Greater Element:");
        System.out.println("   [4,5,2,10,8] → " + Arrays.toString(nextGreater(new int[] { 4, 5, 2, 10, 8 })));

        // 8. Evaluate Postfix
        System.out.println("\n8. Evaluate Postfix:");
        System.out.println("   \"23*54*+\" → " + evaluatePostfix("23*54*+"));
    }
}
