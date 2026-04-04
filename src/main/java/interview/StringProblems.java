package interview;

/**
 * STRING PROBLEMS - Most commonly asked in Persistent interviews
 * Run each method, understand the pattern, then try to write from memory.
 */
public class StringProblems {

    // =============================================
    // 1. REMOVE VOWELS FROM STRING
    // Input: "hello world" → Output: "hll wrld"
    // =============================================
    public static String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // =============================================
    // 2. REVERSE A STRING (without StringBuilder.reverse)
    // Input: "hello" → Output: "olleh"
    // =============================================
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    // =============================================
    // 3. CHECK PALINDROME
    // Input: "racecar" → true, "hello" → false
    // =============================================
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // =============================================
    // 4. FIRST NON-REPEATING CHARACTER
    // Input: "aabbcdd" → 'c'
    // Pattern: Use HashMap/array to count frequencies
    // =============================================
    public static char firstNonRepeating(String s) {
        int[] freq = new int[256]; // ASCII
        for (char c : s.toCharArray()) freq[c]++;
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) return c;
        }
        return '_'; // no non-repeating char
    }

    // =============================================
    // 5. CHECK ANAGRAM
    // Input: "listen", "silent" → true
    // =============================================
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] freq = new int[256];
        for (char c : s1.toCharArray()) freq[c]++;
        for (char c : s2.toCharArray()) freq[c]--;
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
    }

    // =============================================
    // 6. COUNT WORDS IN A STRING
    // Input: "  hello   world  " → 2
    // =============================================
    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }

    // =============================================
    // 7. REVERSE WORDS IN A STRING
    // Input: "hello world java" → "java world hello"
    // =============================================
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        return sb.toString();
    }

    // =============================================
    // 8. COMPRESS STRING (Run-Length Encoding)
    // Input: "aaabbcdddd" → "a3b2c1d4"
    // =============================================
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char current = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == current) {
                count++;
                i++;
            }
            sb.append(current).append(count);
        }
        // Return compressed only if shorter
        return sb.length() < s.length() ? sb.toString() : s;
    }

    // =============================================
    // MAIN - Run and test everything
    // =============================================
    public static void main(String[] args) {
        System.out.println("=== STRING PROBLEMS ===\n");

        // 1. Remove Vowels
        System.out.println("1. Remove Vowels:");
        System.out.println("   \"hello world\" → \"" + removeVowels("hello world") + "\"");

        // 2. Reverse String
        System.out.println("\n2. Reverse String:");
        System.out.println("   \"hello\" → \"" + reverseString("hello") + "\"");

        // 3. Palindrome
        System.out.println("\n3. Palindrome Check:");
        System.out.println("   \"racecar\" → " + isPalindrome("racecar"));
        System.out.println("   \"hello\" → " + isPalindrome("hello"));
        System.out.println("   \"A man a plan a canal Panama\" → " + isPalindrome("A man a plan a canal Panama"));

        // 4. First Non-Repeating
        System.out.println("\n4. First Non-Repeating Character:");
        System.out.println("   \"aabbcdd\" → '" + firstNonRepeating("aabbcdd") + "'");
        System.out.println("   \"aabb\" → '" + firstNonRepeating("aabb") + "'");

        // 5. Anagram
        System.out.println("\n5. Anagram Check:");
        System.out.println("   \"listen\", \"silent\" → " + isAnagram("listen", "silent"));
        System.out.println("   \"hello\", \"world\" → " + isAnagram("hello", "world"));

        // 6. Count Words
        System.out.println("\n6. Count Words:");
        System.out.println("   \"  hello   world  \" → " + countWords("  hello   world  "));

        // 7. Reverse Words
        System.out.println("\n7. Reverse Words:");
        System.out.println("   \"hello world java\" → \"" + reverseWords("hello world java") + "\"");

        // 8. Compress
        System.out.println("\n8. String Compression:");
        System.out.println("   \"aaabbcdddd\" → \"" + compress("aaabbcdddd") + "\"");
    }
}
