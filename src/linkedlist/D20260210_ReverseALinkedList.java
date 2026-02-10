package linkedlist;

public class D20260210_ReverseALinkedList {

        public static void main(String[] args) {


            LinkedList linkedList = new LinkedList();

            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);

            linkedList.reverseALinkedList();

    }



    static class LinkedList{
            private Node head;


            void reverseALinkedList(){

                // Head 1, 2, 3, 4
                Node curr = head, prev = null, next;

                while(curr!=null){

                    //store next
                    next = curr.next; // Next 2, 3, 4 | 3, 4 | 4  | null

                    // Revere's current Node next pointer
                    curr.next = prev; // 1, null |  2, 1 , null | 3, 2, 1, null | 4,3,2,1,null

                    prev = curr; // 1 |  2, 1 | 3, 2, 1 | 4, 3, 2, 1
                    curr = next; // 2,3,4 | 3, 4 | 4 | null

                }

                head = prev;

                printList();

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
