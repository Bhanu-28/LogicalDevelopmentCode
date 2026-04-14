package arrays.arraylist;

import java.util.Vector;

public class D20261404_VectorDoublingExample {

	public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(2); // initial capacity = 2
        System.out.println("Initial capacity: " + vector.capacity());

        // Add elements to trigger capacity increase
        vector.add(10);
        vector.add(20);
        System.out.println("Capacity after adding 2 elements: " + vector.capacity());

        vector.add(30); // Triggers resize (2  4)
        System.out.println("Capacity after adding 3rd element: " + vector.capacity());

        vector.add(40);
        vector.add(50); // Triggers resize again (4  8)
        System.out.println("Capacity after adding 5 elements: " + vector.capacity());
    }
	
	
}
