package strings;

public class GreedyAlgorithm {

    public static void main(String[] args) {
        System.out.println(solve("bhanupradeep"));
    }

    static int solve(String s) {
        int[] last = new int[26];

        // Step 1: store last occurrence
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }

        int end = 0, start = 0;
        int result = 0;

        // Step 2: traverse
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);

            if (i == end) {
                int len = end - start + 1;
                result += len * len;
                start = i + 1;
            }
        }

        return result;
    }
}
