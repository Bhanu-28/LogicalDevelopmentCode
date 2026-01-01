package leetcode.contest;

import java.util.*;

public class FruitBowlRefined {

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

    // Core method: accepts N and int[][] pointsArray
    public static long computeLowerHullPerimeter(int N, int[][] pointsArray) {
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(pointsArray[i][0], pointsArray[i][1]);
        }

        // Step 1: Sort points
        Arrays.sort(points);

        // Step 2: Build only LOWER hull (bowl)
        List<Point> lowerBowl = new ArrayList<>();
        for (Point p : points) {
            while (lowerBowl.size() >= 2 &&
                    cross(lowerBowl.get(lowerBowl.size() - 2),
                            lowerBowl.get(lowerBowl.size() - 1), p) <= 0) {
                lowerBowl.remove(lowerBowl.size() - 1);
            }
            lowerBowl.add(p);
        }

        // Step 3: Compute perimeter of lower hull only
        double perimeter = 0.0;
        for (int i = 0; i < lowerBowl.size() - 1; i++) {
            perimeter += dist(lowerBowl.get(i), lowerBowl.get(i + 1));
        }

        // Step 4: Return rounded perimeter
        return Math.round(perimeter);
    }

    public static void main(String[] args) {
        int N1 = 8;
        int[][] input1 = {
                {3, 4}, {5, 5}, {2, 2}, {2, 5},
                {6, 4}, {4, 1}, {1, 3}, {4, 3}
        };

        int N2 = 14;
        int[][] input2 = {
                {3, 9}, {4, 9}, {7, 9}, {2, 7}, {5, 7}, {9, 6}, {1, 5},
                {6, 5}, {7, 0}, {3, 5}, {3, 1}, {2, 3}, {8, 2}, {4, 0}
        };

        System.out.println(computeLowerHullPerimeter(N1, input1)); // Output for first case
        System.out.println(computeLowerHullPerimeter(N2, input2)); // Output for second case
    }
}
