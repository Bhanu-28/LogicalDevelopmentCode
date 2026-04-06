package interview.experience.hps;

import static org.hamcrest.CoreMatchers.describedAs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HpsAssesmentQuestion2 {
	
	/*
	 You are given a method with signature like:

	String decodeMessage(List<String> dictionary, String message)
	
	dictionary contains valid words, e.g. ["orange", "banana", "carrot"].
	message contains multiple space-separated words.
	Each word in message is a scrambled form of a dictionary word such that:
	First letter is the same.
	Last letter is the same.
	Middle characters are shuffled.
	Assume every word in message has a valid match in dictionary.
	Return the corrected message with proper dictionary words in original order.
	Example:
	
	dictionary: ["orange", "banana", "carrot"]
	message: "ogarne bnaana ctraor"
	output: "orange banana carrot"
	 */
	
	public static void main(String[] args) {
		
		
		List<String> dictionary = new ArrayList<>(Arrays.asList("to","developer","rights","provisions","ticket","jira","assign","a","jyna"));
		String message = "agissn a jria tkecit to dlopeveer jnya jria bhanu";
		String decodedMessage = decodeMessage(dictionary, message);
		
		System.out.println("Dictionary : "+dictionary);
		System.out.println("Message : "+message);
		System.out.println("Decoded Message : "+decodedMessage);
	}
	
	
	public static String decodeMessage(List<String> dictionary, String message) {
		
		// split Message by space.
		String[] splitMessage = message.split(" ");
		StringBuilder finalResult = new StringBuilder();
		int index = 0;
		
		for(String scrambled : splitMessage) {
			String decodedMessage = searchMatchingWordHashMap(scrambled,dictionary);
			finalResult.append(decodedMessage);
			
			
			if(index < splitMessage.length) {
				finalResult.append(" ");
			}
			
			
			
		}
		
		
		return finalResult.toString();
		
		
	}
	
	private static String searchMatchingWordHashMap(String scrambled, List<String> dictionary) {
		
		//pre-process dictionary.
		
		HashMap<String, String> cache = new HashMap<>();
		
		for(String word: dictionary) {
			String key = word.charAt(0) + "" + word.charAt(word.length()-1) + "" + sortMiddleCharacters(word);
			cache.put(key, word);
		}
		
		// Then O(1) lookup for each scrambled word
		String sortMiddleCharacters = sortMiddleCharacters(scrambled);
		String scrambledKey = scrambled.charAt(0)+ ""+scrambled.charAt(scrambled.length()-1)+ ""+ sortMiddleCharacters;
		
		
		String correctWord = cache.get(scrambledKey);
		if(correctWord!=null) {
			return correctWord;
		}
		return scrambled;
	}
	
	private static String searchMatchingWordInDictionary(String scrambled, List<String> dictionary) {
		
		int scrambledLength = scrambled.length();
		for(String word : dictionary) {
			
			
			// if length is not matching we will check for next word.
			if(word.length() != scrambledLength) {
				continue;
			}
			
			
			// if first and last char is not matching we will check for next one in dictionary.
			if(word.charAt(0)!= scrambled.charAt(0) || 
			  word.charAt(word.length()-1)!= word.charAt(word.length()-1)) {
				continue;
			}
			
			
			// sort middle characters and compare.
			System.out.println("First two checks passed...");
			String sortMiddleCharactersOfDictionary = sortMiddleCharacters(word);
			String sortMiddleCharactersOfScrambled = sortMiddleCharacters(scrambled);
			
			if(sortMiddleCharactersOfDictionary.equals(sortMiddleCharactersOfScrambled)) {
				return word;
			}
			
			
		}
		
		return scrambled;
		
	}


	private static String sortMiddleCharacters(String word) {
		
		// if length is less than 2 then return "" as there were no middle characters.
		if(word.length()<=2) {
			return "";
		}
		
		// extract middle words by using substring.
		String substring = word.substring(1, word.length()-1);
		char[] charArray = substring.toCharArray();
		java.util.Arrays.sort(charArray);
		
		return new String(charArray);
		
		
	}
	
	

}
