package linkedlist;

import java.util.ArrayList;

public class D20260210_ReverseALinkedList {

        public static void main(String[] args) {


            LinkedList linkedList = new LinkedList();

            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);

            // Time Complexity is O(n)
            // Auxilary space required is O(1)
//            linkedList.reverseALinkedList();

//            Naive Solution with extra space and running a loop twice.
//            First loop to copy the data into arrayList second one is to add and
//            add that data in reverse order to head and remove the content in arrayList.

            linkedList.reverseALinkedListNaive();


            //
            Node rest_head = linkedList.reverseALinkedListRecursive(linkedList.head);

            // here head is updated one
            linkedList.printList(rest_head);

            // here head will be 4 --> null because we modified head recursively.
            linkedList.printList();


    }



    static class LinkedList{
            private Node head;

            /*
             prev we hold reversed linked list.
             */
            void reverseALinkedList(){

                // Head 1, 2, 3, 4
                Node curr = head, prev = null, next;

                while(curr!=null){

                    //store next
                    next = curr.next; // Next 2, 3, 4 | 3, 4 | 4  | null

                    // Reverse's current Node next pointer
                    curr.next = prev; // 1, null |  2, 1 , null | 3, 2, 1, null | 4,3,2,1,null

                    prev = curr; // 1 |  2, 1 | 3, 2, 1 | 4, 3, 2, 1
                    curr = next; // 2,3,4 | 3, 4 | 4 | null

                }

                head = prev;

                printList();

            }


            void reverseALinkedListNaive(){

                ArrayList<Integer> arrayList = new ArrayList<Integer>();

                for(Node curr = head; curr!=null; curr= curr.next){
                    arrayList.add(curr.data);
                }

                for(Node curr = head; curr!=null; curr = curr.next){
                    curr.data = arrayList.remove(arrayList.size()-1);
                }

                printList();

            }
            
	       /*
	       	 
	       	 Basically u reverse everything after me and I will add in the tail.
	       	 
	       	 for example 1,2,3,4
	       	 recursively we will return 4.
	       	 next rest_head will hold the head of reversed linked list.
	       	 
	       	 next we will return 4 --> 3
	       	 
	       	 here now existing head will become 2-->3-->null as we have done head.next =null;
	       	 
	       	 now after modification it becomes 3 --> 2 --> null return rest_head which becomes 4 --> 3 --> 2 --> null
	       	 
	       	 Note : 4 is connected to 3 at first 3 is connected to nothing later 3 is connected to 2 now when u return 
	       	 
	       	 rest_head it becomes 4-->3-->2--> null similarly 1 as well
	       	 
	       	 
	       	 which reverse the whole linked list recursively.
	       	 
	       	 
	       */
            Node reverseALinkedListRecursive(Node head){
            	
            	

                if(head == null | head.next == null){
                    return head;
                }

                Node rest_head = reverseALinkedListRecursive(head.next);

                Node rest_tail = head.next;
                rest_tail.next = head;

                head.next = null;


                return rest_head;
            }

            // overloaded method
            void printList(Node head){
                Node curr = head;

                while(curr!=null){
                    System.out.print(curr.data+"-->");
                    curr = curr.next;
                }
                System.out.print(curr);
                System.out.println();
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
