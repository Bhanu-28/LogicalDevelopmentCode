package collections.iterators;

import java.util.Iterator;

public class TestIterators {
	
	
public static void main(String[] args) {
	OurGenericList<Integer> genericList = new OurGenericList<>();
	
	genericList.add(10);
	genericList.add(20);
	genericList.add(30);
	genericList.add(40);
	
	
	System.out.printf("element at index %d :"+genericList.getItemAtIndex(2),2);
	System.out.println();
	
	Iterator<Integer> iterator = genericList.iterator();
	
	System.out.print("Elements in the generic list were : ");
	while(iterator.hasNext()) {
		System.out.printf(iterator.next()+" "); 
		
	}
	
}	
	

}
