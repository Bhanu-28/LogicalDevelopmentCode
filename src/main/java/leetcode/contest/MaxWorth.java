package leetcode.contest;

import java.util.*;
/*
Max Worth
Problem Description
Maya's String Challenge: Make it Worthy!

The Challenge: Maya loves strings! To test her skills, she is given a set of strings, each with a unique cost and a "worth" value based on the sum of its character place values (a=1, b=2,... z=26). She wants to create the highest-worth main string by selecting and concatenating some of these strings within a given budget.

The Catch: Some strings are contradictory - meaning they cannot coexist in the main string. If one is included, the other must be excluded.

Your Task: Given the list of strings, their costs, and contradictory pairs, along with Maya's budget, determine the maximum worth of the main string she can create while adhering to these constraints.

Constraints
1 <= N, M <= 50

1 <= cost of a string <= 100

1 <= amount Maya have <= 500

1 <= length of each string <= 20

The strings will be having lower case alphabets only.

If a string A is contradictory with B and B is contradictory with C, then A is not contradictory with C i.e., the term contradictory is not transitive.

Input
Line 1: Two space-separated integers: N (number of strings) and M (number of contradictory pairs).

Line 2: N space-separated strings.

Line 3: N space-separated integers representing the cost of each string.

Lines 4 to M+3: Each line contains two space-separated strings, indicating a contradictory pair.

Line M+4: A single integer representing Maya's budget.

Output
A single integer representing the maximum worth of the main string Maya can achieve.

Time Limit (secs)
1

Examples
Example 1

Input

9 5

kite btech codevita space biscuit earth dog afraid travel

5 4 8 10 2 18 15 12 11

kite travel

codevita earth

biscuit btech

space travel

afraid dog

10

Output

162

Explanation

Maya can select the strings {codevita, biscuit}, which have costs of 8 and 2, respectively, which are within her budget i.e.., 8+2 <= 10. The worth of the string codevita is 79, and the worth of biscuit is 83, giving a total worth of 162, which is the maximum possible.

Example 2

Input

5 5

crow sky park thursday flying

6 3 4 9 13

flying sky

sky thursday

crow sky

park sky

park flying

20

Output

221

Explanation

Maya can select the strings {crow, park, thursday}, which have costs of 6, 4 and 9, respectively, which are within her budget i.e.., 6+4+9 <= 20. The worth of the string crow is 59, park is 46 and the worth of thursday is 116, giving a total worth of 221, which is the maximum possible.
*/
public class MaxWorth {

    // Helper class to store a valid choice (total cost and worth) for a group.
    static class Choice {
        int cost;
        int worth;

        Choice(int cost, int worth) {
            this.cost = cost;
            this.worth = worth;
        }
    }

    static int[] costs;
    static int[] worths;
    static List<Integer>[] adj;
    static List<Choice> currentGroupChoices;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- 1. PRE-PROCESSING ---
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<String, Integer> stringToIndex = new HashMap<>();
        String[] strings = new String[n];
        costs = new int[n];
        worths = new int[n];

        for (int i = 0; i < n; i++) {
            strings[i] = sc.next();
            stringToIndex.put(strings[i], i);
        }

        for (int i = 0; i < n; i++) {
            costs[i] = sc.nextInt();
            worths[i] = calculateWorth(strings[i]);
        }

        // --- 2. BUILD CONTRADICTION GRAPH ---
        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int u = stringToIndex.get(sc.next());
            int v = stringToIndex.get(sc.next());
            adj[u].add(v);
            adj[v].add(u);
        }

        int budget = sc.nextInt();

        // --- 3. FIND COMPONENTS & GENERATE CHOICES ---
        List<List<Choice>> allGroupsChoices = new ArrayList<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                findComponent(i, visited, component);

                currentGroupChoices = new ArrayList<>();
                generateGroupChoices(component, 0, 0, 0, new ArrayList<>());
                allGroupsChoices.add(currentGroupChoices);
            }
        }

        // --- 4. GROUPED KNAPSACK DP ---
        int[][] dp = new int[allGroupsChoices.size() + 1][budget + 1];

        for (int i = 1; i <= allGroupsChoices.size(); i++) {
            List<Choice> group = allGroupsChoices.get(i - 1);
            for (int j = 0; j <= budget; j++) {
                // Option 1: Don't take any choice from the current group.
                dp[i][j] = dp[i - 1][j];
                // Option 2: Iterate through choices in the current group.
                for (Choice choice : group) {
                    if (j >= choice.cost) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - choice.cost] + choice.worth);
                    }
                }
            }
        }

        System.out.print(dp[allGroupsChoices.size()][budget]);
        sc.close();
    }

    // Helper to calculate the worth of a single string.
    private static int calculateWorth(String s) {
        int worth = 0;
        for (char c : s.toCharArray()) {
            worth += (c - 'a' + 1);
        }
        return worth;
    }

    // DFS to find all strings in a single connected component.
    private static void findComponent(int u, boolean[] visited, List<Integer> component) {
        visited[u] = true;
        component.add(u);
        for (int v : adj[u]) {
            if (!visited[v]) {
                findComponent(v, visited, component);
            }
        }
    }

    // Recursive backtracking to generate all valid choices for a component.
    private static void generateGroupChoices(List<Integer> component, int index, int currentCost, int currentWorth, List<Integer> chosen) {
        if (index == component.size()) {
            currentGroupChoices.add(new Choice(currentCost, currentWorth));
            return;
        }

        // Option 1: Don't include the string at 'index'.
        generateGroupChoices(component, index + 1, currentCost, currentWorth, chosen);

        // Option 2: Try to include the string at 'index'.
        int currentStringIndex = component.get(index);
        boolean isContradictory = false;
        for (int chosenStringIndex : chosen) {
            // A simple contains check on the adjacency list works because it's a small list.
            if (adj[currentStringIndex].contains(chosenStringIndex)) {
                isContradictory = true;
                break;
            }
        }

        if (!isContradictory) {
            chosen.add(currentStringIndex);
            generateGroupChoices(component, index + 1, currentCost + costs[currentStringIndex], currentWorth + worths[currentStringIndex], chosen);
            // Backtrack
            chosen.remove(chosen.size() - 1);
        }
    }
}
