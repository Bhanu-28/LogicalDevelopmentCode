package linkedlist;

public class D20260219_RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(4);


        linkedList.removeDuplicatesFromSortedList(linkedList.head);


        LinkedList linkedList1 = new LinkedList();

        linkedList1.append(10);
        linkedList1.append(20);
        linkedList1.append(20);
        linkedList1.append(30);
        linkedList1.append(30);
        linkedList1.append(30);


        linkedList1.removeDuplicates(linkedList1.head);

    }



    static class LinkedList{
        private Node head;


        Node removeDuplicates(Node head){
            Node curr = head;

            while(curr!=null && curr.next!= null){
                if(curr.data == curr.next.data){
                    curr.next = curr.next.next;
                }
                else{
                    curr = curr.next;
                }
            }

            return head;
        }

        /*

        Traverse the list from the head. while traversing compare each node
        with next node. if the data of the next node is same as current node
        delete the next node. before we delete we need to store the next pointer.
         */
        Node removeDuplicatesFromSortedList(Node head){

            if(head == null || head.next == null){
                return head;
            }

            Node curr = head;

            while(curr!=null){

                Node temp = curr;

                while(temp!=null && temp.data == curr.data){
                    temp = temp.next;
                }

                curr.next = temp;
                curr = curr.next;
            }

            return head;

        }

        void printList(){
            Node curr = head;

            while(curr!=null){
                System.out.print(curr.data+"-->");
                curr = curr.next;
            }
            System.out.print(curr);
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
