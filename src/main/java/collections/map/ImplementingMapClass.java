package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
		
		
		/*
		 * Creating an adjacency list for graph questions using HashMap
		 *  
		 *  1 - 3
		 *  3 - 5
		 *  1 - 2
		 */
		
		
		Map<Integer , List<Integer>> adjacencyMap = new HashMap<>();
		
//		if(adjacencyMap.get(1)==null) {
//			adjacencyMap.put(1, new ArrayList<>());
//		}
//		
//		adjacencyMap.get(1).add(3);
		
		// can rewrite above piece of code using computeIfAbsent
		
		adjacencyMap.computeIfAbsent(1, function-> new ArrayList<>()).add(3);
		adjacencyMap.computeIfAbsent(1, function-> new ArrayList<>()).add(2);
		adjacencyMap.computeIfAbsent(3, function-> new ArrayList<>()).add(5);
		
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for(Map.Entry<Integer,String> entry : entrySet) {
			
			System.out.println("key :"+entry.getKey()+" Value : "+entry.getValue());
			
		}
		
		Set<Integer> keySet = map.keySet();
		System.out.println("Keys ");
		for(Integer key : keySet) {
			System.out.print(key+",");
		}
		
		
		
		
		
		
	}

}
