package collections.list.arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		
		List<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(8);
		
		System.out.print(arrayList);
		
		System.out.println();
		System.out.println("iterator way of printing elements");
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		// Replacing an element.
		
		Integer previousElement = arrayList.set(2, 100);
	}

}
