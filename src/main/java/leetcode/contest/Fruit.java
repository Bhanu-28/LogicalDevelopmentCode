package leetcode.contest;

import java.util.*;

public class Fruit {

    static class Point implements Comparable<Point> {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public int compareTo(Point p) {
            if (this.x != p.x) return this.x - p.x;
            return this.y - p.y;
        }
    }

    private static long cross(Point o, Point a, Point b) {
        return (long)(a.x - o.x) * (b.y - o.y) -
                (long)(a.y - o.y) * (b.x - o.x);
    }

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

        // Build upper hull
        List<Point> upper = new ArrayList<>();
        for (int i = points.length - 1; i >= 0; i--) {
            Point p = points[i];
            while (upper.size() >= 2 &&
                    cross(upper.get(upper.size() - 2),
                            upper.get(upper.size() - 1), p) <= 0) {
                upper.remove(upper.size() - 1);
            }
            upper.add(p);
        }

        // Concatenate lower + upper to form convex hull
        List<Point> hull = new ArrayList<>(lower);
        for (int i = 1; i < upper.size() - 1; i++) {
            hull.add(upper.get(i));
        }

        // Extract the "bowl" (lower chain: leftmost -> rightmost)
        int left = 0, right = 0;
        for (int i = 1; i < hull.size(); i++) {
            if (hull.get(i).x < hull.get(left).x) left = i;
            if (hull.get(i).x > hull.get(right).x) right = i;
        }

        List<Point> bowl = new ArrayList<>();
        int i = left;
        bowl.add(hull.get(i));
        while (i != right) {
            i = (i + 1) % hull.size();
            bowl.add(hull.get(i));
        }

        // Compute perimeter of this chain
        double perimeter = 0.0;
        for (int j = 0; j < bowl.size() - 1; j++) {
            perimeter += dist(bowl.get(j), bowl.get(j + 1));
        }

        System.out.print(Math.round(perimeter));
        sc.close();
    }
}
