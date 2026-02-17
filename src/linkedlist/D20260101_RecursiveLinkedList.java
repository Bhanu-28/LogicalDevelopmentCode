package linkedlist;

public class D20260101_RecursiveLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node element1 = new Node(1);
        element1.next = new Node(2);
        element1.next.next = new Node(3);

        // print data recursively.
        recursive(element1);

    }

    public static void recursive(Node element) {
        if (element == null) {
            System.out.println(element);
            return;
        }
        System.out.print(element.data + "-->");
        recursive(element.next);
    }
}
