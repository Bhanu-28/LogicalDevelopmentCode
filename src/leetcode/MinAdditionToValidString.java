package leetcode;

import java.util.Stack;

public class MinAdditionToValidString {
	public static void main(String[] args) {
				MinAdditionToValidString minAdditionToValidString = new MinAdditionToValidString();
				System.out.println(minAdditionToValidString.addMinimum("acb"));
				System.out.println(minAdditionToValidString.addMinimum("b"));
				System.out.println(minAdditionToValidString.addMinimum("cbacb"));	
				System.out.println(minAdditionToValidString.addMinimumStackBased("acb"));
				System.out.println(minAdditionToValidString.addMinimumStackBased("b"));
				System.out.println(minAdditionToValidString.addMinimumStackBased("cbacb"));	
		}

	public int addMinimum(String word) {
		String validString = "abc";
		int addMinCount = 0; 
		int wordIndex = 0;
		int validStringIndex = 0;
		int wordLength = word.length();
		while(wordIndex<wordLength) {
			if(word.charAt(wordIndex)==validString.charAt(validStringIndex)) {
				wordIndex++;
			}else {
				addMinCount++;
			}
			validStringIndex = (validStringIndex+1)%3;
		}
		addMinCount += (3-validStringIndex)%3;
		return addMinCount;

	}
	
	public int addMinimumStackBased(String word) {
		Stack<Character> wordStack = new Stack<>();
		int count = 0;
		for(int i =0; i < word.length();i++) {
			wordStack.push(word.charAt(i));
		}
		while(!wordStack.isEmpty()) {
			if(!wordStack.isEmpty() && wordStack.peek()=='c') {
				wordStack.pop();
			}else {
				count ++;
			}
			if(!wordStack.isEmpty() && wordStack.peek()=='b') {
				wordStack.pop();
			}else {
				count ++;
			}
			if(!wordStack.isEmpty() && wordStack.peek()=='a') {
				wordStack.pop();
			}else {
				count ++;
			}
			
		}

		return count;

	}

}
