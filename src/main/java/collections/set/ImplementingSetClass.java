package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ImplementingSetClass {
	
	public static void main(String[] args) {
		
		
		List<Integer> arrayList = new ArrayList<>();
		
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(8);
		
		Set<Integer> set1 = new HashSet<>(arrayList);
		
		System.out.println("set 1 : "+set1);
		
		Set<Integer> set2 = new HashSet<>();
		
		set2.add(8);
		set2.add(1);
		set2.add(2);
		
		System.out.println("set 2 :"+set2);
		
		System.out.println("after retaining");
		

		
		
		/*
		 * 
		 * set 2 will remain unchanged 
		 * All the changes will be done on set 1 
		 * Now set1 will have all the intersection elements.
		 */
		// Intersection
		set1.retainAll(set2);
		
		
		System.out.println("set 1 : "+set1);
		System.out.println("set 2 : "+set2);
		
		// common will be removed from set 1 so will be blank as both were same.
		System.out.println("After removing");
		
		// difference
		set1.removeAll(set2);
		
		System.out.println("set 1 : "+set1);
		System.out.println("set 2 : "+set2);
		
		
		
		
		Set<Integer> set3 = new HashSet<>();
		
		set3.add(10);
		set3.add(20);
		set3.add(30);
		
		//union
		set3.addAll(set2);
		System.out.println("set 3 : "+set3);
		System.out.println("set 2 : "+set2);
		
		
		Set<Integer> set4 = new LinkedHashSet<>();
		
		set4.add(10);
		set4.add(20);
		set4.add(30);
		
		System.out.println("LinkedHashSet which maintains order: "+set4);
		
		
		
	}

}
