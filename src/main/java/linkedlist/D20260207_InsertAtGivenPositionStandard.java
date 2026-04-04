package linkedlist;

public class D20260207_InsertAtGivenPositionStandard {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.append(5);
        list.append(4);
        list.append(2);
        list.append(1);

        System.out.println("Initial list:");
        list.print();

        list.insertAtPosition(3, 3);
        System.out.println("After inserting 3 at position 3:");
        list.print();

        list.insertAtPosition(1, 100);
        System.out.println("After inserting 100 at position 1:");
        list.print();

        list.insertAtPosition(9, 3);
        System.out.println("After inserting 3 at position 9 (invalid):");
        list.print();

        list.insertAtPosition(7, 999);
        System.out.println("After inserting 999 at position 7:");
        list.print();
    }


    static class LinkedList {

        private Node head;

        // Insert at end (helper)
        void append(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                return;
            }

            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }

        // Insert at given position (1-based)
        void insertAtPosition(int position, int data) {
            Node newNode = new Node(data);

            // Insert at head
            if (position == 1) {
                newNode.next = head;
                head = newNode;
                return;
            }

            Node curr = head;
            int counter = 1;

            while (curr != null && counter < position - 1) {
                curr = curr.next;
                counter++;
            }

            // Invalid position
            if (curr == null) {
                return;
            }

            newNode.next = curr.next;
            curr.next = newNode;
        }

        void print() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + "-->");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
}




}
