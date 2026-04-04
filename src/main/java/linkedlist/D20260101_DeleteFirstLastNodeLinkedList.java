package linkedlist;

import java.util.Scanner;

public class D20260101_DeleteFirstLastNodeLinkedList {

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

        System.out.println("Before deleting at the Begin");
        printNode(node1);

        Node newNode = deleteAtBegin(node1);

        System.out.println("After deleting at the Begin");

        printNode(newNode);

        Node endNode = deleteAtEnd(newNode);

        System.out.println("After deleting at the End");

        printNode(endNode);

    }

    static Node deleteAtBegin(Node node) {

        if (node == null)
            return null;
        else {
            return node.next;
        }
    }

    static Node deleteAtEnd(Node node) {

//         1, 2 , 3 , 4 , 5

        if (node == null)
            return null;
        if (node.next == null)
            return null;
        Node curr = node;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
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
