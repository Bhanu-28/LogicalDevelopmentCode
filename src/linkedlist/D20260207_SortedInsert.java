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

        printNodes(head);
        sortedInsert(head,8);
        printNodes(head);

        Node headNodeChanged = sortedInsert(head,1);
        printNodes(headNodeChanged);

        sortedInsert(head,100);
        printNodes(head);



    }

    private static void printNodes(Node head) {

        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }

        System.out.print(curr);
        System.out.println();
    }

    private static Node sortedInsert(Node head, int dataToInsert) {

        Node newNode = new Node(dataToInsert);

        if(head==null){
            return newNode;
        }
        if(dataToInsert < head.data ){

            newNode.next  = head;
            return newNode;
        }
        Node curr = head;
        while(curr.next!=null && curr.next.data < dataToInsert){
            curr = curr.next;
        }

        // Important
        /*
        Store the curr.next items in newNode.next.
        Now new Node have newNode and Curr Next Data.
        Attach it back to curr next.


         */
        newNode.next = curr.next;
        curr.next = newNode;


        return head;
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
