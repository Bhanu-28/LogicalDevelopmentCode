package test.interview.day18;

import java.util.HashMap;

import java.util.Map;

import java.util.Scanner;

public class NonRepeatingCharFinder {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		
		String inputString = scanner.nextLine();
		
		Map<Character, Integer> charCountMap = new HashMap<>();
		
		for (int i = 0; i < inputString.length(); i++) {
		
			char c = inputString.charAt(i);
			
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	
		}
	
		for (int i = 0; i < inputString.length(); i++) {
		
		char c = inputString.charAt(i);
		
		if (charCountMap.get(c) == 1) {
		
			System.out.println("The first non-repeating character in " + inputString + " is " + c + ".");
			
			break;
		
			}
		
		}
		
		scanner.close();
	
	}
	
}