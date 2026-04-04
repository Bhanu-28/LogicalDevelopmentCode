package linkedlist;

import java.util.Scanner;

public class D20260101_SearchInLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);

        Node n3 = new Node(100);
        Node n5 = new Node(29);

        n1.next = n5;
        n5.next = n2;
        n2.next = n3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter an Element to search in LinkedList :");
        int elementToSearch = sc.nextInt();


//        Return the position in the linked list
        int location = searchElementRecursive(n1, elementToSearch);

        if (location == -1) {
            System.out.println("Element not found");
        } else {
            System.out.printf("Element %d found at %d sposition", elementToSearch, location);
        }

    }

    static int searchElement(Node head, int elementToSearch) {

        // 10 , 29 , 100 , 20
        Node curr = head;

        int position = 1;
        while (curr != null) {
            if (curr.data == elementToSearch) {
                return position;
            }
            position++;
            curr = curr.next;
        }
        position = -1;

        return position;
    }

    static int searchElementRecursive(Node head, int elementToSearch) {

        // 10 , 29 , 100 , 20

        Node curr = head;
        if (curr == null)
            return -1;
        if (curr.data == elementToSearch) {
            return 1;
        } else {
            int res = searchElementRecursive(curr.next, elementToSearch);
            if (res == -1)
                return -1;
            else
                return (res + 1);
        }
    }

}