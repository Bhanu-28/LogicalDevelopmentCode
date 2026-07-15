package collections.map;

import java.util.HashMap;
import java.util.Map;

public class ImplementingMapClass {
	
	public static void main(String[] args) {
		
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Bhanu");
		map.put(2, "Pradeep");
		map.put(3, "Kumar");
		map.put(4, "test");
		
		System.out.println(map.getOrDefault(1, "default"));
		System.out.println(map.containsValue("test"));
		
		
		Map<Integer, StudentMarks> studentMap = new HashMap<>();
		
		studentMap.put(1, new StudentMarks(50,30));
		studentMap.put(2, new StudentMarks(20,40));
		studentMap.put(3, new StudentMarks(30,20));
		studentMap.put(4, new StudentMarks(70,10));
		
		System.out.println(studentMap.get(1));
		System.out.println(studentMap.containsValue(new StudentMarks(20, 40)));
		
		
		
	}

}
