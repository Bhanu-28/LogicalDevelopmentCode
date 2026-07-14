package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

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
		
		// Custom Type student marks
		
		List<StudentMarks> stMarksList = new ArrayList<>();
		
		stMarksList.add(new StudentMarks(80,50));
		stMarksList.add(new StudentMarks(100,30));
		stMarksList.add(new StudentMarks(60,20));
		stMarksList.add(new StudentMarks(90,70));
		stMarksList.add(new StudentMarks(120,60));
		
		Set<StudentMarks> studentMarks = new HashSet<>(stMarksList);
		
		System.out.println(studentMarks);
		
		// ideally it should true right why false?
		/*
		 * Because of Internal implementation HashSet
		 * whenever a object is created it will generate an hashCode and keep them in the Bucket.
		 * Inside the bucket it will check whether it is equals or not if not it will return false.
		 * so Implement Hashcode and equals() method.
		 */
		System.out.println("Now Implemented hashcode and equals");
		System.out.println(studentMarks.contains(new StudentMarks(100, 30)));
		
		// Treeset
		
		Set<StudentMarks> treeSet = new TreeSet<>((a,b)->b.getPhysics()-a.getPhysics());
		
		treeSet.add(new StudentMarks(80,50));
		treeSet.add(new StudentMarks(100,30));
		treeSet.add(new StudentMarks(60,20));
		treeSet.add(new StudentMarks(90,70));
		treeSet.add(new StudentMarks(120,60));
		
		for(StudentMarks x :treeSet) {
			System.out.print(x+",");
		}
		
		NavigableSet<Integer> set5 = new TreeSet<>();
		
		set5.add(0);
		set5.add(8);
		set5.add(3);
		set5.add(10);
		
		for(int x : set5) {
			System.out.print(x+",");
		}
		System.out.println();
		
		/*
		 * 
		 * 	- `ceiling(e)`: Returns the least element **greater than or equal to** `e`.
			- `floor(e)`: Returns the greatest element **less than or equal to** `e`.
			- `higher(e)`: Returns the least element **strictly greater than** `e`.
			- `lower(e)`: Returns the greatest element **strictly less than** `e`.
		 */
		
		System.out.println("ceiling  : "+set5.ceiling(7));
		System.out.println("floor : "+set5.floor(7));
		
		System.out.println("higher  : "+set5.higher(8));
		System.out.println("lower : "+set5.lower(10));
		
		
		
	}

}
