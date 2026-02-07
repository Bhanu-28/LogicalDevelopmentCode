package linkedlist;

import java.util.Scanner;

public class D20260101_InsertAtBeginEndLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);
        Node node4 = new Node(40);

        node1.next = node2;
        node1.next.next = node3;
        node1.next.next.next = node4;
        printNode(node1);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("please enter a number U want to insert at the Beginning:");
        int elementToInsert1 = sc1.nextInt();

        Node newNode = insertAtBegin(node1, elementToInsert1);

        printNode(newNode);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("please enter a number U want to insert at the End :");
        int elementToInsert2 = sc2.nextInt();

        Node endNode = insertAtEnd(newNode, elementToInsert2);

        printNode(endNode);

    }

    static Node insertAtBegin(Node node, int elementToInsert) {

        Node temp = new Node(elementToInsert);
        temp.next = node;
        return temp;

    }

    static Node insertAtEnd(Node node, int elementToInsert) {

        Node temp = new Node(elementToInsert);

        if (node == null) {
            return temp;
        }

        Node curr = node;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        return node;
    }

    static void printNode(Node node) {

        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }

        System.out.print(node);
        System.out.println();
    }
}
