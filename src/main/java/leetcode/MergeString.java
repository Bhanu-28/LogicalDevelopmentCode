package leetcode;

public class MergeString {
	public static void main(String[] args) {
		MergeString mergeString = new MergeString();
		String word1 = 	"ab";
		String word2 = "pqr";
		String mergedString = mergeString.mergeAlternately(word1 ,word2 );
		System.out.print(mergedString);
	}
	
    public String mergeAlternately(String word1, String word2) {
        
    	StringBuilder mergedString = new StringBuilder();
    	int index = 0;
    	while (index < word1.length()|| index<word2.length()) {
    		if(index<word1.length()) {
    			mergedString.append(word1.charAt(index));
    		}
    		if(index<word2.length()) {
    			mergedString.append(word2.charAt(index));
    		}
    		index ++;
    	}

    	return mergedString.toString();
    }

}
