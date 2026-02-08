package linkedlist;


public class D20260208_MiddleOfLinkedList{

    public static void main(String[] args){


        LinkedList linkedList = new LinkedList();

        linkedList.append(1);
        linkedList.append(100);
        linkedList.append(30);
        linkedList.append(90);


        linkedList.printData();

        linkedList.insertAtGivenPosition(1, 999);

        linkedList.printData();

        linkedList.insertAtGivenPosition(6, 20);

        linkedList.printData();

        linkedList.insertAtGivenPosition(8, 2000);

        linkedList.printData();

        linkedList.printMiddleOfLinkedListNaive();

        linkedList.append(1000);
        linkedList.append(2000);

        linkedList.printMiddleOfLinkedList();

    }


    static class LinkedList{

        private Node head;

        void printMiddleOfLinkedList(){
            if(head== null){
                return;
            }

            Node slow = head, fast = head;

            while(fast!=null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.print("Middle of LinkedList : "+slow.data);
            System.out.println();
        }

        void printMiddleOfLinkedListNaive(){

            if(head==null){
                return;
            }
            int count = 0;

            Node curr;

            //count Nodes.
            for(curr = head; curr!=null; curr= curr.next ){
                count++;
            }

            curr = head;
            for(int i =0; i < count/2 ; i ++){
                curr = curr.next;
            }

            System.out.print("Middle of LinkedList Naive: "+curr.data);
            System.out.println();

        }

        void insertAtGivenPosition(int position, int dataToInsert){

            Node newNode = new Node(dataToInsert);

            if(position == 1){
                newNode.next = head;
                head = newNode;
                return;
            }

            int counter = 1;
            Node curr = head;
            while(curr!= null && counter < position - 1){
                curr = curr.next;
                counter++;
            }

            if(curr == null){
                System.out.println("Invalid position");
                return;
            }

            newNode.next =  curr.next;
            curr.next = newNode;
        }

        void append(int data){

            Node newNode = new Node(data);
            if(head==null){
                head = newNode;
                return;
            }

            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }

            curr.next = newNode;
        }

        void printData(){
            Node curr = head;

            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr = curr.next;
            }

            System.out.print(curr);
            System.out.println();
        }
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