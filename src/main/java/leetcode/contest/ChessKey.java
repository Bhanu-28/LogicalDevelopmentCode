package leetcode.contest;
import java.util.*;
/*
Chess Key
Problem Description
You're tasked with calculating the number of unique chessboard positions achievable after 'd' plies (one-half moves).

Here's the setup:

Chessboard: Standard 8x8 grid.
Pieces: At most three pieces of the same color: Queen, Rook, and Bishop.
Placement: At least one of each piece must be present on the board.
Depth (d): The number of plies (moves) to consider. A ply usually represents a half move in a 2-player game. In our case, since only one coloured pieces are placed, it should be construed to mean a move.
Your Goal: Determine the total number of unique chessboard positions possible after 'd' plies.

For better understanding the Chessboard, go through the details below.

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@22d6cac2:image1.png

The positions of the chess pieces are represented using three characters:

The first character is either Q, B, or R, denoting a Queen, Bishop, or Rook, respectively.
The second character ranges from A to H, indicating the column in the chessboard.
The third character ranges from 1 to 8, indicating the row in the chessboard.
For example, QA8 represents a Queen positioned on the 8th row of the A column.

Constraints
0 < d < 5

Input
The first line specifies the positions of the pieces, separated by spaces.
The second line indicates d, the ply depth

Output
A single integer representing number of unique board positions across a depth of d plies

Time Limit (secs)
1

Examples
Example 1

Input

QA3 RB3

1

Output

27

Explanation

Below shows the initial state. After every move, the board position will be recorded.

com.tcs.cv.automata.ei.middleware.DocxToHtmlConverter@22d6cac2:image2.png

In this chess position, either the Queen or the Rook will be moved on the next turn (one ply).

Queen's Movement: The Queen can be legally placed in 14 distinct squares: a1, a2, a4 to a8, b2, c1, b4 to f8.
Rook's Movement: The Rook can occupy 13 unique squares: b1, b2, b4 to b8, and c3 to h3.
Therefore, there are a total of 14 + 13 = 27 possible board positions after one ply (one move).

Print 27 as the output, representing the number of unique board positions achievable within a depth of 1 ply.

Example 2

Input

QA3

2

Output

64

Explanation

At a depth of 2 positions on an empty board (Queen is the only piece on the board), it will cover all 64 distinct squares. Hence only 64 unique positions are possible. Hence print 64 as output.

Example 3

Input

QA3 RB3

2

Output

388

Explanation

At a depth of 2 position with Queen at a3, Rook at b3, 388 is the number of unique board positions achievable within a depth of 2 ply.

*/
public class ChessKey {

    // A standard, final class for the board state. This is more compatible than a record.
    final static class BoardState {
        // Positions are 0-63, -1 if absent.
        final int q, r, b;

        BoardState(int queenPos, int rookPos, int bishopPos) {
            this.q = queenPos;
            this.r = rookPos;
            this.b = bishopPos;
        }

        // A proper equals method is crucial for the HashSet to work correctly.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BoardState that = (BoardState) o;
            return q == that.q && r == that.r && b == that.b;
        }

        // A matching hashCode is also essential.
        @Override
        public int hashCode() {
            return Objects.hash(q, r, b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] initialPositions = sc.nextLine().split(" ");
        int d = sc.nextInt();
        sc.close();

        int queenPos = -1, rookPos = -1, bishopPos = -1;
        for (String posStr : initialPositions) {
            if (posStr.isEmpty()) continue;
            int row = posStr.charAt(2) - '1';
            int col = posStr.charAt(1) - 'A';
            int pos = row * 8 + col;

            switch (posStr.charAt(0)) {
                case 'Q' -> queenPos = pos;
                case 'R' -> rookPos = pos;
                case 'B' -> bishopPos = pos;
            }
        }
        BoardState initialState = new BoardState(queenPos, rookPos, bishopPos);

        Queue<BoardState> queue = new LinkedList<>();
        // This set will store all unique positions found *after* a move.
        Set<BoardState> reachablePositions = new HashSet<>();
        // This set tracks states already added to the queue to avoid redundant processing.
        Set<BoardState> queuedStates = new HashSet<>();

        queue.add(initialState);
        queuedStates.add(initialState);

        for (int i = 0; i < d; i++) {
            int levelSize = queue.size();
            for (int j = 0; j < levelSize; j++) {
                BoardState current = queue.poll();
                List<BoardState> nextStates = generateNextStates(current);

                for (BoardState next : nextStates) {
                    reachablePositions.add(next);
                    if (queuedStates.add(next)) { // .add() returns true if the element was new
                        queue.offer(next);
                    }
                }
            }
        }
        // Using print() to avoid extra newlines, which can cause Presentation Error.
        System.out.print(reachablePositions.size());
    }

    // Generates all possible next board states from the current one.
    private static List<BoardState> generateNextStates(BoardState current) {
        List<BoardState> nextStates = new ArrayList<>();
        if (current.q != -1) generatePieceMoves(nextStates, current, 'Q');
        if (current.r != -1) generatePieceMoves(nextStates, current, 'R');
        if (current.b != -1) generatePieceMoves(nextStates, current, 'B');
        return nextStates;
    }

    // Generates moves for a specific piece.
    private static void generatePieceMoves(List<BoardState> states, BoardState current, char pieceType) {
        int startPos;
        int[][] directions;

        if (pieceType == 'Q') {
            startPos = current.q;
            directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}, {1,1}, {1,-1}, {-1,1}, {-1,-1}};
        } else if (pieceType == 'R') {
            startPos = current.r;
            directions = new int[][]{{1,0}, {-1,0}, {0,1}, {0,-1}};
        } else { // Bishop
            startPos = current.b;
            directions = new int[][]{{1,1}, {1,-1}, {-1,1}, {-1,-1}};
        }

        int startR = startPos / 8;
        int startC = startPos % 8;

        for (int[] dir : directions) {
            int dr = dir[0];
            int dc = dir[1];
            int newR = startR + dr;
            int newC = startC + dc;

            while (newR >= 0 && newR < 8 && newC >= 0 && newC < 8) {
                int newPos = newR * 8 + newC;
                if (newPos == current.q || newPos == current.r || newPos == current.b) {
                    break;
                }

                if (pieceType == 'Q') states.add(new BoardState(newPos, current.r, current.b));
                else if (pieceType == 'R') states.add(new BoardState(current.q, newPos, current.b));
                else states.add(new BoardState(current.q, current.r, newPos));

                newR += dr;
                newC += dc;
            }
        }
    }
}