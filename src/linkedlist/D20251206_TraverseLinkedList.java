package linkedlist;


public class D20251206_TraverseLinkedList{

    static class Node{
        int data;
        Node next;

        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args){


        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);


        traverse(head);


    }

    public static void traverse(Node head){
            Node curr = head;

            while(curr!=null){
                System.out.print(curr.data + "-->");
                curr = curr.next;
            }

        System.out.println(curr);
    }



}