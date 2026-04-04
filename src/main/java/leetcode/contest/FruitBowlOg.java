package leetcode.contest;

import java.util.*;

public class FruitBowlOg {

    static class Point implements Comparable<Point> {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if (this.x != p.x) {
                return this.x - p.x;  // sort by x
            }
            return this.y - p.y;      // then by y
        }
    }

    // Cross product: orientation check
    private static long cross(Point o, Point a, Point b) {
        return (long)(a.x - o.x) * (b.y - o.y) - (long)(a.y - o.y) * (b.x - o.x);
    }

    // Euclidean distance
    private static double dist(Point a, Point b) {
        return Math.sqrt(
                (long)(a.x - b.x) * (a.x - b.x) +
                        (long)(a.y - b.y) * (a.y - b.y)
        );
    }

    public static void main(String[] args) {

        int N1 = 8;
        int[][] input1 = {
                {3, 4},
                {5, 5},
                {2, 2},
                {2, 5},
                {6, 4},
                {4, 1},
                {1, 3},
                {4, 3}
        };
        int N = 14;
        int[][] input = {
                {3, 9},
                {4, 9},
                {7, 9},
                {2, 7},
                {5, 7},
                {9, 6},
                {1, 5},
                {6, 5},
                {7, 0},
                {3, 5},
                {3, 1},
                {2, 3},
                {8, 2},
                {4, 0}
        };

        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(input[i][0], input[i][1]);
        }

        // Step 1: Sort points
        Arrays.sort(points);

        // Step 2: Build only LOWER Bowl
        List<Point> lowerBowl = new ArrayList<>();
        for (Point p : points) {
            while (lowerBowl.size() >= 2 &&
                    cross(lowerBowl.get(lowerBowl.size() - 2),
                            lowerBowl.get(lowerBowl.size() - 1)
                            , p) <= 0) {
                lowerBowl.remove(lowerBowl.size() - 1);
            }
            lowerBowl.add(p);
        }

        // Step 3: Compute perimeter of lower hull only
        double perimeter = 0.0;
        for (int i = 0; i < lowerBowl.size() - 1; i++) { // not closed loop
            Point a = lowerBowl.get(i);
            Point b = lowerBowl.get(i + 1);
            perimeter += dist(a, b);
        }

        // Step 4: Print rounded result
        System.out.println(Math.round(perimeter));
    }
}
