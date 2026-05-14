package collections.generics;

import java.util.ArrayList;

public class Generics {
	
	
	
	public static void main(String[] args) {
		
		// instance of integer
		Test<Integer> testInteger = new Test<>(15);
		
		System.out.println(testInteger.getObj());
		
		
		// instance of integer
		Test<String> testString = new Test<>("bhanu");
				
		System.out.println(testString.getObj());
		

		
		
		genericDisplay("bhanu");
		genericDisplay(05);
		genericDisplay(5.0);
		
		
		
		// Creatinga an ArrayList without any type specified
        ArrayList al = new ArrayList();

        al.add("Sweta");
        al.add("Gudly");
        al.add(10); // Compiler allows this

        String s1 = (String)al.get(0);
        String s2 = (String)al.get(1);
		
        
        // Causes Runtime Exception
//        String s3 = (String)al.get(2);
        
        
        // Creating a an ArrayList with String specified
        // to solve above issue
        ArrayList <? super String> stringArray = new ArrayList<> ();
        
        stringArray.add("test");
		
	}
	
	
	static <T> void genericDisplay(T element) {
		
		System.out.println(element.getClass().getName()+ " = "+element);
	}
	
	/*
	 * 
	 * We can also pass multiple Type parameters in Generic classes. 
	 */
	static class Test<T>{
		
		T obj;
		private T[] items;
		
		Test(){
			items = (T[]) new Object[100];
		}
		
		
		Test(T obj){
			this.obj = obj;
		}
		
		public T getObj() {
			return this.obj;
		}
	}

}
