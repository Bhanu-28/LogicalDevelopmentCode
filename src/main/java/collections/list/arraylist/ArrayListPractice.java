package collections.list.arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		
		
		// collections are generic interfaces always have to pass references.
		// int --> Integer float --> Float double -> Double (wrapper classes) --> read this
		// boxing and unboxing. --> when u use Integer and in for each when u got the element compiler automically converts that to int and pass it. --> this is unboxing.
		
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
			System.out.print(" "+iterator.next());
		}
		
		System.out.println();
		
		// Replacing an element.
		
		Integer previousElement = arrayList.set(2, 100);
		System.out.println("Element which got replaced : "+previousElement);
		
		
		// create a new arrayList by passing an collection in constructor.
		// u can pass any collection instead of arrayList.
		List<Integer> arrayList2 = new ArrayList<>(arrayList);
		
		arrayList2.add(2);
		
		System.out.println("array list 2 : "+arrayList2);
		
		// adding elements in pre-existing arraylist with elements and addOther elements.
		
		List<Integer> arrayList3 = new ArrayList<>();
		
		arrayList3.add(007);
		arrayList3.addAll(arrayList2);
		
		arrayList3.add(7);
		
		System.out.println("arrayList3 : "+arrayList3);
		
		// find index of element
		System.out.println("Index of Element :"+arrayList3.indexOf(7));// here boxing will happen and it will converted to Integer wrapper class internally
		System.out.println(arrayList3.indexOf( new Integer(7))); 
		
		// find last index of element.
		System.out.println("last index :"+arrayList3.lastIndexOf(7));
		
		
		// Sub List.
		// from index is inclusive and toIndex is exclusive.
		List<Integer> subList = arrayList3.subList(1, 4);
		
		System.out.println("sub list : "+subList);
		
		subList.set(2,3);
		subList.add(4);
		
		System.out.println("subList after replacing 2nd indexed element :"+subList);
		
		
		// doesn't creates copy it just gives view.
		// underlying contents will get changed shallow copy that is being done here 
		// be conscious here.
		// Its not deep copy it is just copy of reference.
		System.out.println("Main List from which we create subList :"+arrayList3);
		
	}

}
