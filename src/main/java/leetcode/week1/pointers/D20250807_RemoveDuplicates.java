package leetcode.week1.pointers;

public class D20250807_RemoveDuplicates {

    public static void main(String[] args) {

        int[] values = { 1, 1, 5, 7, 7, 9, 9, 10, 11, 20, 21, 21, 22 };
        Node head = createLinkedList(values);

        printList(head);

        head = removeDuplicates(head);

        printList(head);

    }

    private static Node removeDuplicates(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        while (current != null && current.next != null) {
            // Duplicate found
            if (current.data == current.next.data) {
                System.out.println("duplicate found :" + current.data + " " + current.next.data);
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();

    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    public static Node createLinkedList(int[] values) {

        Node head = null;
        Node tail = null;
        for (int value : values) {
            Node node = new Node(value);

            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }
}
