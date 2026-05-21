package test.interview.day9;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringMalipulationMap {
	
	public static void main(String[] args) {
		

	    List<String> input = Arrays.asList("apple","ball","cat","ant",null,"ANT");

	    List<String> output = input.stream()
	        .filter(Objects::nonNull)
	        .filter(s -> s.toLowerCase().startsWith("a"))
	        .map(String::toUpperCase)
	        .distinct()
	        .collect(Collectors.toList());

	    System.out.println(output);

	}

}
