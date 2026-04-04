package leetcode.contest;

import java.util.*;
/*
Agilans Project
Problem Description
Agilan, a final-semester undergraduate student, needs to reach his teammate Rabin's house to finalize their major project due in February.

Rabin provides Agilan with detailed driving directions consisting of turns and distances at traffic signals. However, due to heavy traffic, Agilan makes one wrong turn while covering the correct distance. He successfully follows the remaining instructions accurately.

You are given the coordinates of Rabin's house and a set of directions provided by Rabin (which include "left," "right," "straight," and "back" turns).

Your task is to:

Identify the specific turn Agilan made incorrectly.
Determine the correct turn he should have taken.
Note: Agilan starts his journey facing 'north' initially.

Instructions are elaborated below for brevity:

1. left - This instructs Agilan to turn towards his left (for e.g., North to East, East to South, South to West, West to North) from wherever he is going on.

2. right - This instructs Agilan to turn towards his right from wherever he is going on.

3. straight - This instructs Agilan to go straight continuing with the same direction wherever he is going on.

4. back - This instructs Agilan to turn back (U-turn, for e.g. North to South, South to North, East to West, West to East) from wherever he is going on.

Constraints
3 <= N <= 104

Distance travelled in one instruction <= 50

Input
First line contains and integer 'N' - indicating number of instructions Rabin has provided to Agilan for visiting his place.

Next N lines consist of N instructions each defining the direction and its corresponding distance.

Last 2 lines consists of the co-ordinates (x, y space-separated integers) defining location of Agilan's residence and Rabin's residence, respectively.

Output
Output "No" if Agilan cannot reach Rabin's house by correcting only one turn.

Output "Yes" followed by:

The specific incorrect turn Agilan made.
The distance covered while taking the incorrect turn.
The correct turn he should have taken instead.
The distance associated with the correct turn.
For exact printing format refer the Examples section

Time Limit (secs)
1

Examples
Example 1

Input

5

right 5

left 3

left 3

right 1

right 2

0 0

0 2

Output

Yes

right 1

left 1

Explanation

Agilan starts his journey from the coordinates (0, 0), facing north. The path he followed is represented in blue, while the correct path is depicted in orange. Upon analysis, it is evident that Agilan would have reached Rabin's residence correctly if he had followed the second-to-last instruction properly. Instead of proceeding right for 1 unit at (2, 3), he should have taken a left turn for 1 unit. Therefore, the incorrect instruction is "right 1", and the correct instruction is "left 1".

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@94f6bfb:image1.png

Example 2

Input

8

straight 5

right 2

right 7

right 5

straight 1

left 2

left 3

right 4

0 0

12 14

Output

No

Explanation

Agilan starts his journey from the coordinates (0, 0) facing north. The path he followed is represented in blue. It can be clearly deduced that by correcting exactly one path, Agilan will not be able to reach Rabin's residence (12, 14). Therefore, the answer is 'No'.
 */
class Instruction {
    String turn;
    int distance;
    int turnValue; // 0: straight, 1: right, 2: back, 3: left

    Instruction(String turn, int distance, Map<String, Integer> turnMap) {
        this.turn = turn;
        this.distance = distance;
        this.turnValue = turnMap.get(turn);
    }
}

public class AgilansProject {

    // 0: North, 1: East, 2: South, 3: West
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Map turns to integer values for easier calculations
        Map<String, Integer> turnMap = new HashMap<>();
        turnMap.put("straight", 0);
        turnMap.put("right", 1);
        turnMap.put("back", 2);
        turnMap.put("left", 3);

        Map<Integer, String> turnValueToString = new HashMap<>();
        turnValueToString.put(0, "straight");
        turnValueToString.put(1, "right");
        turnValueToString.put(2, "back");
        turnValueToString.put(3, "left");

        int n = sc.nextInt();
        Instruction[] instructions = new Instruction[n];
        for (int i = 0; i < n; i++) {
            instructions[i] = new Instruction(sc.next(), sc.nextInt(), turnMap);
        }

        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int targetX = sc.nextInt();
        int targetY = sc.nextInt();
        sc.close();

        // 1. Prefix Pass: Calculate state before each instruction
        long[] prefixX = new long[n + 1];
        long[] prefixY = new long[n + 1];
        int[] prefixDir = new int[n + 1];

        prefixX[0] = startX;
        prefixY[0] = startY;
        prefixDir[0] = 0; // Start facing North

        for (int i = 0; i < n; i++) {
            int currentDir = (prefixDir[i] + instructions[i].turnValue + 4) % 4;
            prefixX[i + 1] = prefixX[i] + (long)dx[currentDir] * instructions[i].distance;
            prefixY[i + 1] = prefixY[i] + (long)dy[currentDir] * instructions[i].distance;
            prefixDir[i + 1] = currentDir;
        }

        // 2. Suffix Pass: Calculate displacement from each point to the end
        long[][] suffixDx = new long[n + 1][4];
        long[][] suffixDy = new long[n + 1][4];

        for (int i = n - 1; i >= 0; i--) {
            for (int startDir = 0; startDir < 4; startDir++) {
                int currentDir = (startDir + instructions[i].turnValue + 4) % 4;
                long moveX = (long)dx[currentDir] * instructions[i].distance;
                long moveY = (long)dy[currentDir] * instructions[i].distance;

                suffixDx[i][startDir] = moveX + suffixDx[i + 1][currentDir];
                suffixDy[i][startDir] = moveY + suffixDy[i + 1][currentDir];
            }
        }

        // 3. Final Check: Combine prefix and suffix in O(1) for each possibility
        for (int i = 0; i < n; i++) {
            Instruction originalInst = instructions[i];

            for (int altTurnValue = 0; altTurnValue < 4; altTurnValue++) {
                if (altTurnValue == originalInst.turnValue) {
                    continue;
                }

                // State before the mistake
                long prevX = prefixX[i];
                long prevY = prefixY[i];
                int prevDir = prefixDir[i];

                // Calculate the move for the mistaken turn
                int mistakeDir = (prevDir + altTurnValue + 4) % 4;
                long mistakeMoveX = (long)dx[mistakeDir] * originalInst.distance;
                long mistakeMoveY = (long)dy[mistakeDir] * originalInst.distance;

                // Position after the mistaken move
                long posAfterMistakeX = prevX + mistakeMoveX;
                long posAfterMistakeY = prevY + mistakeMoveY;

                // Add the pre-calculated displacement of the rest of the path
                long finalX = posAfterMistakeX + suffixDx[i + 1][mistakeDir];
                long finalY = posAfterMistakeY + suffixDy[i + 1][mistakeDir];

                if (finalX == targetX && finalY == targetY) {
                    System.out.println("Yes");
                    System.out.println(originalInst.turn + " " + originalInst.distance);
                    System.out.print(turnValueToString.get(altTurnValue) + " " + originalInst.distance);
                    return;
                }
            }
        }

        System.out.print("No");
    }
}