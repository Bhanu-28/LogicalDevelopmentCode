package interview.thg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LiveCodingQuestion {
	
	public static void main(String[] args) {
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		// List<String> result = "a", "b", "c"....
		
		
		List<String> result = Arrays.stream(array)
							  .flatMap(Arrays::stream)
							  .toList();
		
		System.out.println(result);
		
		
		List<Integer> integers = new ArrayList<>(){{
			add(1); add(40); add(1034); add(50); add(1023); add(2); add(3152);
		}};
		 
		Integer highest = integers.stream().max(Integer::compareTo).orElse(null);
		
		System.out.println(highest);
	}


}
