package linkedlist;

public class D20260423_ArrayToLinkedList {

	
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = CustomLinkedList.convertArrayToLinkedList(arr);
        
        System.out.println("Custom Linked List:");
        CustomLinkedList.printList(head);
    }
	
	static class CustomLinkedList {
	    public static Node convertArrayToLinkedList(int[] arr) {
	        if (arr.length == 0) return null;

	        // Create the head of the list

	        Node head = new Node(arr[0]);
	        Node current = head;

	        // Iterate through the rest of the array
	        for (int i = 1; i < arr.length; i++) {
	            current.next = new Node(arr[i]);
	            current = current.next;
	        }
	        return head;
	    }

	    public static void printList(Node head) {
	        Node temp = head;
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	    }

	    


	}
	
	static class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
}
}