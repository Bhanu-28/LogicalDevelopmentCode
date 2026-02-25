package interview;

import java.util.*;

/**
 * HASHMAP & HASHING PROBLEMS - Very common in interviews
 * Pattern: Almost every "find something in O(1)" → use HashMap
 */
public class HashMapProblems {

    // =============================================
    // 1. FREQUENCY COUNT OF CHARACTERS
    // Input: "programming" → {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
    // =============================================
    public static Map<Character, Integer> charFrequency(String s) {
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    // =============================================
    // 2. FREQUENCY COUNT OF WORDS
    // Input: "the cat sat on the mat" → {the=2, cat=1, sat=1, on=1, mat=1}
    // =============================================
    public static Map<String, Integer> wordFrequency(String s) {
        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String word : s.split("\\s+")) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        return freq;
    }

    // =============================================
    // 3. GROUP ANAGRAMS
    // Input: ["eat","tea","tan","ate","nat","bat"]
    // Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
    // Pattern: Sort each word → use as key
    // =============================================
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(map.values());
    }

    // =============================================
    // 4. SUBARRAY WITH GIVEN SUM (Map of prefix sums)
    // Input: [1,4,20,3,10,5], sum=33 → true (20+3+10)
    // Pattern: Prefix sum + HashSet
    // =============================================
    public static boolean subarrayWithSum(int[] arr, int targetSum) {
        Set<Integer> prefixSums = new HashSet<>();
        int currentSum = 0;
        prefixSums.add(0);
        for (int num : arr) {
            currentSum += num;
            if (prefixSums.contains(currentSum - targetSum)) {
                return true;
            }
            prefixSums.add(currentSum);
        }
        return false;
    }

    // =============================================
    // 5. FIRST REPEATING ELEMENT
    // Input: [10,5,3,4,3,5,6] → 5 (index 1, appears again at 5)
    // =============================================
    public static int firstRepeating(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        int result = -1;
        // Traverse from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            if (seen.contains(arr[i])) {
                result = arr[i];
            }
            seen.add(arr[i]);
        }
        return result;
    }

    // =============================================
    // 6. LONGEST SUBSTRING WITHOUT REPEATING CHARS
    // Input: "abcabcbb" → 3 ("abc")
    // Pattern: Sliding window + HashMap
    // THIS IS A CLASSIC
    // =============================================
    public static int longestSubstringWithoutRepeats(String s) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLen = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= start) {
                start = lastSeen.get(c) + 1;
            }
            lastSeen.put(c, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    // =============================================
    // MAIN
    // =============================================
    public static void main(String[] args) {
        System.out.println("=== HASHMAP & HASHING PROBLEMS ===\n");

        // 1. Char Frequency
        System.out.println("1. Character Frequency:");
        System.out.println("   \"programming\" → " + charFrequency("programming"));

        // 2. Word Frequency
        System.out.println("\n2. Word Frequency:");
        System.out.println("   \"the cat sat on the mat\" → " + wordFrequency("the cat sat on the mat"));

        // 3. Group Anagrams
        System.out.println("\n3. Group Anagrams:");
        System.out.println("   " + groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }));

        // 4. Subarray Sum
        System.out.println("\n4. Subarray with Sum:");
        System.out.println("   [1,4,20,3,10,5], sum=33 → " + subarrayWithSum(new int[] { 1, 4, 20, 3, 10, 5 }, 33));
        System.out.println("   [1,4,20,3,10,5], sum=100 → " + subarrayWithSum(new int[] { 1, 4, 20, 3, 10, 5 }, 100));

        // 5. First Repeating
        System.out.println("\n5. First Repeating Element:");
        System.out.println("   [10,5,3,4,3,5,6] → " + firstRepeating(new int[] { 10, 5, 3, 4, 3, 5, 6 }));

        // 6. Longest Substring
        System.out.println("\n6. Longest Substring Without Repeats:");
        System.out.println("   \"abcabcbb\" → " + longestSubstringWithoutRepeats("abcabcbb"));
        System.out.println("   \"bbbbb\" → " + longestSubstringWithoutRepeats("bbbbb"));
        System.out.println("   \"pwwkew\" → " + longestSubstringWithoutRepeats("pwwkew"));
    }
}
