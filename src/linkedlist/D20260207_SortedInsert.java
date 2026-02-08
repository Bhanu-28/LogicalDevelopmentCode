package linkedlist;

public class D20260207_SortedInsert {

    public static void main(String[] args) {


        Node head = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(10);
        Node node4 = new Node(20);


        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        sortedInsert(head,25);
        sortedInsert(head,8);
        sortedInsert(head,1);
        sortedInsert(head,100);


    }

    private static void sortedInsert(Node head, int dataToInsert) {


    }


    static class Node{
        int data;
        Node next;


        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

}
