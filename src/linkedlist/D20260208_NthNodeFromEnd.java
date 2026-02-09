package linkedlist;


public class D20260208_NthNodeFromEnd {

    public static void main(String[] args){


        LinkedList linkedList = new LinkedList();

        linkedList.append(789);
        linkedList.append(100);
        linkedList.append(30);
        linkedList.append(90);
        linkedList.append(1000);
        linkedList.append(2000);

        linkedList.printNthNodeFromEndNaive(3);

        linkedList.printNthNodeFromEnd(10);

        linkedList.printNthNodeFromEnd(1);

        linkedList.printNthNodeFromEnd(6);


    }


    static class LinkedList{

        private Node head;

        void printNthNodeFromEnd(int position){
            Node first = head;

            for(int i = 0; i < position; i++){
                if(first == null){
                    System.out.print("Invalid position");
                    System.out.println();
                    return;
                }
                first = first.next;
            }

            Node second = head;
            while(first!=null){
                second = second.next;
                first = first.next;
            }

            System.out.print(position+" th Node from End "+ second.data);
            System.out.println();
        }
        void printNthNodeFromEndNaive(int position){
            int length = 0;
            for(Node curr = head; curr!=null; curr= curr.next){
                length++;
            }

            if(length<position){
                System.out.println("Invalid "+position+"th Position from end");
                return;
            }

            Node curr = head;
            for(int i = 1; i < length - position + 1; i ++){
                    curr = curr.next;
            }

            System.out.print(position+"th Position from end "+curr.data);
            System.out.println();
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