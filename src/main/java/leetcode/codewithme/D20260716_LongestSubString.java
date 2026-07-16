package leetcode.codewithme;

public class D20260716_LongestSubString {
	
	    public static void main(String[] args) {
	        String input = "cadbzabcd";

	        
	        int length = lengthOfLongestSubstring(input);

	        System.out.println("Length of longest substring without repeating characters: " + length);
	    }
	
		// Brute force approach.
	    public static int lengthOfLongestSubstring(String s) {
	        int size = s.length();
	        int maxLength = 0;

	        for(int i=0; i < size; i++){

	            int hash[] = new int[256];
	            for(int j =i; j < size; j++){
	                if(hash[s.charAt(j)]==1){
	                    // found repeating character..
	                    break;
	                }
	                hash[s.charAt(j)] = 1;
	                int length = j - i +1;
	               if(maxLength>=length){
	                    continue;
	               }
	               else{
	                maxLength = length;
	               }
	            }

	        } 
	        return maxLength;
	    }


}


