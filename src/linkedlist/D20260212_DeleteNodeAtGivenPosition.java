package linkedlist;

public class D20260212_DeleteNodeAtGivenPosition {

    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);





        linkedList.deleteANodeAtGivenPosition(0);

        linkedList.printList();

    }



    static class LinkedList{
        private Node head;


        Node deleteANodeAtGivenPosition(int position){

            if(position <=0 || head == null){
                return head;
            }

            if(position == 1 ){
                head = head.next;
                return head;
            }

            Node temp = head;
            Node prev = null;

            for(int i = 1; i < position&& temp!=null; i++){
                prev = temp;
                temp = temp.next;
            }

            if(temp == null){
                return head;
            }

            prev.next = temp.next;
            return head;
        }


        Node deleteANodeAtGivenPositionRecursive(Node head, int position){

            if(position < 1){
                return head;
            }

            if(head == null){
                return null;
            }

            if (position == 1){ return head.next; }
            head.next = deleteANodeAtGivenPositionRecursive(head.next, position-1);
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
