package collections.generics;

public class StaticVariables {
	
	
	
	public static void main(String[] args) {
		
		
		StaticVariables outer = new StaticVariables();
		
		
		Test<Integer> obj1 = outer.new Test<>();
		Test<String> obj2 = outer.new Test<>();
		Test<Character> obj3 = outer.new Test<>();
		
		
		System.out.println(Test.count); // output:3
		
		/*
		 * 
		 * 
		 * Explanation: Even though we created objects of Test<Integer>, Test<String> and Test<Double>, 
		 * only one class Test exists at runtime due to type erasure. 
		 * Therefore, the static variable count is shared among all instances, regardless of their type parameter.
		 */
	}
	
	
	class Test<T>{
		
		static int count = 0;
		Test(){
			
			count++;
		}
	}
	
	
	

}
