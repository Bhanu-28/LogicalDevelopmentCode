package interview;

/**
 * LINKED LIST PROBLEMS - Know these basics
 * You already practice LinkedList in your DSA repo — this is a quick refresher
 */
public class LinkedListProblems {

    // Simple Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Helper: Create linked list from array
    static Node createList(int[] arr) {
        if (arr.length == 0)
            return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper: Print linked list
    static void printList(Node head) {
        Node current = head;
        StringBuilder sb = new StringBuilder("   ");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null)
                sb.append(" → ");
            current = current.next;
        }
        sb.append(" → null");
        System.out.println(sb);
    }

    // =============================================
    // 1. REVERSE A LINKED LIST
    // Input: 1→2→3→4→5→null
    // Output: 5→4→3→2→1→null
    // THIS IS THE #1 MOST ASKED LL QUESTION
    // =============================================
    static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next; // save next
            current.next = prev; // reverse pointer
            prev = current; // move prev forward
            current = next; // move current forward
        }
        return prev; // prev is new head
    }

    // =============================================
    // 2. DETECT CYCLE (Floyd's Algorithm)
    // Pattern: Slow pointer (1 step) + Fast pointer (2 steps)
    // If they meet → cycle exists
    // =============================================
    static boolean hasCycle(Node head) {
        if (head == null)
            return false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    // =============================================
    // 3. FIND MIDDLE ELEMENT
    // Pattern: Slow (1 step) + Fast (2 steps)
    // When fast reaches end, slow is at middle
    // =============================================
    static int findMiddle(Node head) {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // =============================================
    // 4. NTH NODE FROM END
    // Pattern: Two pointers, gap of N
    // =============================================
    static int nthFromEnd(Node head, int n) {
        Node first = head, second = head;
        // Move first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        // Move both until first reaches end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second.data;
    }

    // =============================================
    // 5. REMOVE DUPLICATES FROM SORTED LIST
    // Input: 1→1→2→3→3→null
    // Output: 1→2→3→null
    // =============================================
    static Node removeDuplicates(Node head) {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next; // skip duplicate
            } else {
                current = current.next;
            }
        }
        return head;
    }

    // =============================================
    // 6. MERGE TWO SORTED LISTS
    // Input: 1→3→5 and 2→4→6
    // Output: 1→2→3→4→5→6
    // =============================================
    static Node mergeSorted(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    // =============================================
    // MAIN
    // =============================================
    public static void main(String[] args) {
        System.out.println("=== LINKED LIST PROBLEMS ===\n");

        // 1. Reverse
        System.out.println("1. Reverse Linked List:");
        System.out.println("   Before:");
        Node list1 = createList(new int[] { 1, 2, 3, 4, 5 });
        printList(list1);
        System.out.println("   After:");
        printList(reverse(list1));

        // 2. Cycle Detection
        System.out.println("\n2. Cycle Detection:");
        Node list2 = createList(new int[] { 1, 2, 3, 4, 5 });
        System.out.println("   No cycle: " + hasCycle(list2));
        // Create a cycle: 5→3
        Node temp = list2;
        Node node3 = null;
        while (temp.next != null) {
            if (temp.data == 3)
                node3 = temp;
            temp = temp.next;
        }
        temp.next = node3; // create cycle
        System.out.println("   With cycle (5→3): " + hasCycle(list2));
        temp.next = null; // remove cycle for safety

        // 3. Find Middle
        System.out.println("\n3. Find Middle:");
        Node list3 = createList(new int[] { 1, 2, 3, 4, 5 });
        System.out.println("   [1,2,3,4,5] → Middle: " + findMiddle(list3));

        // 4. Nth from End
        System.out.println("\n4. Nth Node from End:");
        Node list4 = createList(new int[] { 10, 20, 30, 40, 50 });
        System.out.println("   [10,20,30,40,50], n=2 → " + nthFromEnd(list4, 2));

        // 5. Remove Duplicates
        System.out.println("\n5. Remove Duplicates:");
        Node list5 = createList(new int[] { 1, 1, 2, 3, 3 });
        System.out.println("   Before: ");
        printList(list5);
        removeDuplicates(list5);
        System.out.println("   After: ");
        printList(list5);

        // 6. Merge Sorted
        System.out.println("\n6. Merge Two Sorted Lists:");
        Node a = createList(new int[] { 1, 3, 5 });
        Node b = createList(new int[] { 2, 4, 6 });
        System.out.print("   [1,3,5] + [2,4,6] → ");
        printList(mergeSorted(a, b));
    }
}
