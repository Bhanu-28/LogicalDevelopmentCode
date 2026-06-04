package interview.experience.simplify;

import java.util.*;
import java.util.stream.*;
public class MapAndFlatMapStream {

	



	    public static void main(String[] args) {
	        
	        List<String> list = new ArrayList<>();
	        
	        list.add("test");
	        list.add("spring boot");
	        
	        // one to one
	        // Returns Stream<T>
	        // Returns an object
	        // Simple transformations (e.g., lowercase to uppercase)
	        
	        List<String> result = list.stream()
	                                .map(String::toUpperCase)
	                                .collect(Collectors.toList());
	                                
	        System.out.println(result);
	                                
	        
	        // handle one to many and returns stream(R) flatenned.
	        // one to many.
	        //Returns Stream<R> (flattened)
	        // Returns a Stream
	        // Handling nested collections or optionals
	        List<List<String>> result1 = Arrays.asList(
	            Arrays.asList("test","spring"),
	            Arrays.asList("test1","Boot"));
	            
	        List<String> output = result1.stream()
	                        .flatMap(List::stream)
	                        .collect (Collectors.toList());
	                        
	        System.out.println(output);
	            
	            
	            
	        
	    }
	}

