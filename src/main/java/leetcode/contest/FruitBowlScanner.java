package leetcode.contest;

import java.util.*;

public class FruitBowlScanner {

    static class Point implements Comparable<Point> {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point p) {
            if (this.x != p.x) {
                return this.x - p.x; // sort by x
            }
            return this.y - p.y;     // then by y
        }
    }

    // Cross product: orientation
    private static long cross(Point o, Point a, Point b) {
        return (long)(a.x - o.x) * (b.y - o.y) -
                (long)(a.y - o.y) * (b.x - o.x);
    }

    // Euclidean distance
    private static double dist(Point a, Point b) {
        return Math.sqrt(
                (long)(a.x - b.x) * (a.x - b.x) +
                        (long)(a.y - b.y) * (a.y - b.y)
        );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(points);

        // Build lower hull
        List<Point> lower = new ArrayList<>();
        for (Point p : points) {
            while (lower.size() >= 2 &&
                    cross(lower.get(lower.size() - 2),
                            lower.get(lower.size() - 1), p) <= 0) {
                lower.remove(lower.size() - 1);
            }
            lower.add(p);
        }

        // Compute perimeter (open chain, not closed loop)
        double perimeter = 0.0;
        for (int i = 0; i < lower.size() - 1; i++) {
            perimeter += dist(lower.get(i), lower.get(i + 1));
        }

        // Print ONLY the rounded integer (avoid presentation errors)
        System.out.print(Math.round(perimeter));


        sc.close();
    }
}
