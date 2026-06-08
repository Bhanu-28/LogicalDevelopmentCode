package interview.thg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LiveCodingQuestionStream {
	
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
		 
		Integer highest = integers.stream().max((x,y)-> x.compareTo(y)).orElse(null);
		
		Integer minimum = integers.stream().min(Integer::compareTo).orElse(null);

		
		System.out.println("highest : "+highest);
		System.out.println("minimu : "+minimum);
		
		
		
		//practice
		
		String[][][] array1 = new String[][][]{{{"a", "b","c"}, {"c", "d","e"}, {"e", "f","g"}}};

		// List<String> result = "a", "b", "c"....
		
		// Rule:Number of flatMaps = Number of dimensions − 1
		
		List<String> result1 = Arrays.stream(array1)
							  .flatMap(arr -> Arrays.stream(arr))
							  .flatMap(arr -> Arrays.stream(arr))
							  .toList();
		
		System.out.println(result1);
		
		Integer[][] nums = {
		        {1,2},
		        {3,4}
		};
		
		List<Integer> numsResult = Arrays.stream(nums)
				  .flatMap(arr -> Arrays.stream(arr))
				  .toList();
		
		Stream.of(nums)
				  .flatMap(arr -> Arrays.stream(arr))
				  .forEach(System.out::print);
		
		System.out.println(numsResult);
		
		
		List<List<Integer>> numbers = Arrays.asList(
	            Arrays.asList(1, 2),
	            Arrays.asList(3, 4)
	        );
		
		
		System.out.println();
		numbers.stream()
		.flatMap(List<Integer>::stream)
		.forEach(System.out::print);

	       
	}


}
