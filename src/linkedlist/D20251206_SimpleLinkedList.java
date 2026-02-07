package linkedlist;

public class D20251206_SimpleLinkedList {
    public static void main(String[] args) {


        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp3 = new Node(30);


        head.next = temp1;
        temp1.next = temp3;

        System.out.println(head.data+"-->"+ temp1.data+"-->"+ temp3.data);

    }



    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }

    }
}
