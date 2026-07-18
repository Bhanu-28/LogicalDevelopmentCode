package leetcode.codewithme;

import java.util.Arrays;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/2070289731/
public class D20260716_LongestSubString {
	
	    public static void main(String[] args) {
	        String input = "cadbzabcd";
	        String input2 = "acdbzabc";

	        
	        int length = lengthOfLongestSubstringSW(input2);

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
	               maxLength = Math.max(maxLength,length);
	            }

	        } 
	        return maxLength;
	    }
	    
	    
	 // Optimized approach using sliding window.
	    public static int lengthOfLongestSubstringSW(String s) {
	        
	    	
	    	// input : "c a d b z a b c d";
	    	// acdbzabc
	    	int size = s.length();
	    	
	    	int hash[] = new int[256];
	    	
	    	Arrays.fill(hash, -1);
	    	
	    	int left = 0;
	    	int right = 0;
	    	int maxLength = 0;
	    	
	    	while(right<size) {
	    		/* If current character s.charAt(r) 
	               is already in the substring */
	    		if(hash[s.charAt(right)] >= left) {
	    			left = Math.max(hash[s.charAt(right)]+1,left);
	    		}
	    		int len = right - left + 1;
	    		
	    		maxLength = Math.max(maxLength, len);
	    		
	    		hash[s.charAt(right)] = right;
	    		
	    		right++;
	    		
	    	}
	    	
	    	return maxLength;
	    	
	    }


}


