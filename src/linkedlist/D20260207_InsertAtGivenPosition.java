package linkedlist;

public class D20260207_InsertAtGivenPosition {

    public static void main(String[] args) {

        Node node1 = new Node(5);
        Node node2 = new Node(4);
        Node node3 = new Node(2);
        Node node4 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("**************************Approach One Started**********************");
        long startTime = System.currentTimeMillis();
        System.out.println("printing Nodes");
        printNode(node1);
        System.out.println("printing Nodes after Insertion 1");
        Node newInsertedNode = insertAtGivenPositon(node1, 3, 3);

        printNode(newInsertedNode);
        System.out.println("printing Nodes after Insertion 2");
        Node newInsertedNode2 = insertAtGivenPositon(newInsertedNode, 1, 100);

        printNode(newInsertedNode2);

        System.out.println("printing Nodes after Insertion 3");
        Node newInsertedNode3 = insertAtGivenPositon(newInsertedNode2, 9, 3);

        printNode(newInsertedNode3);

        System.out.println("printing Nodes after Insertion 4");
        Node newInsertedNode4 = insertAtGivenPositon(newInsertedNode2, 7, 999);

        printNode(newInsertedNode4);

        long endTime = System.currentTimeMillis();

        System.out.println("**************************Approach One Ended**********************");
        long totalTimeTaken1 = endTime - startTime;

        System.out.println("Total Time taken for Approach 1 : " + totalTimeTaken1);

        System.out.println("**************************Approach Two Started**********************");
        long startTime2 = System.currentTimeMillis();
        System.out.println("printing Nodes");
        printNode(node1);
        System.out.println("printing Nodes after Insertion 1");
        Node newInsertedNodeTSC = insertAtGivenPositionTSC(node1, 3, 3);

        printNode(newInsertedNodeTSC);
        System.out.println("printing Nodes after Insertion 2");
        Node newInsertedNode2TSC = insertAtGivenPositionTSC(newInsertedNodeTSC, 1, 100);

        printNode(newInsertedNode2TSC);

        System.out.println("printing Nodes after Insertion 3");
        Node newInsertedNode3TSC = insertAtGivenPositionTSC(newInsertedNode2TSC, 9, 3);

        printNode(newInsertedNode3TSC);

        System.out.println("printing Nodes after Insertion 4");
        Node newInsertedNode4TSC = insertAtGivenPositionTSC(newInsertedNode2TSC, 7, 999);

        printNode(newInsertedNode4TSC);

        long endTime2 = System.currentTimeMillis();

        System.out.println("**************************Approach One Ended**********************");
        long totalTimeTaken2 = endTime2 - startTime2;

        System.out.println("Total Time taken for Approach 2 : " + totalTimeTaken2);
    }

    static Node insertAtGivenPositon(Node head, int position, int dataToInsert) {

        // Count the Number of Nodes. Input --> head Output -> Size in Int
        int sizeOfNodes = countNodes(head);

        // If position is greater than sizeOfNodes+ 1 we will return head.
        if (position > sizeOfNodes + 1) {
            return head;
        }

        Node curr = head;
        Node newNode = new Node(dataToInsert);
        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        int counter = 1;

        while (curr != null) {
            if (counter + 1 == position) {
                newNode.next = curr.next;
                curr.next = newNode;
                return head;
            }
            curr = curr.next;
            counter++;
        }
        return head;
    }

    private static int countNodes(Node head) {
        int counter = 0;
        while (head != null) {
            counter++;
            head = head.next;
        }
        return counter;
    }

    static void printNode(Node node) {

        while (node != null) {
            System.out.print(node.data + "-->");
            node = node.next;
        }

        System.out.print(node);
        System.out.println();
    }

    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static Node insertAtGivenPositionTSC(Node head, int position, int dataToInsert) {

        Node newNode = new Node(dataToInsert);

        if (position == 1) {
            newNode.next = head;
            return newNode;
        }

        int counter = 1;

        Node curr = head;
        while (curr != null && counter < position - 1) {
            curr = curr.next;
            counter++;
        }

        if (curr == null) {
            return head;
        }

        //save the current.next in new Node.
        newNode.next = curr.next;
        // add newNode to curr.next
        curr.next = newNode;

        return head;

    }
}
