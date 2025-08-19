import java.util.*;

public class FruitBowl {

    // Point class remains the same
    static class Point implements Comparable<Point> {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point p) {
            if (this.x != p.x) {
                return this.x - p.x;
            }
            return this.y - p.y;
        }
    }

    // cross product function remains the same
    private static long cross(Point o, Point a, Point b) {
        // (a.x - o.x) * (b.y - o.y) - (a.y - o.y) * (b.x - o.x)
        return (long)(a.x - o.x) * (b.y - o.y) - (long)(a.y - o.y) * (b.x - o.x);
    }

    // distance function remains the same
    private static double dist(Point a, Point b) {
        long dx = a.x - b.x;
        long dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] points = new Point[N];
        for (int i = 0; i < N; i++) {
            points[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        // Sort points by x, then y
        Arrays.sort(points);

        // Build the lower hull (the bowl) directly
        List<Point> bowl = new ArrayList<>();
        for (Point p : points) {
            // THE FIX: Use < 0 instead of <= 0.
            // This keeps collinear points on the edge of the bowl.
            // We only pop when the new point creates a right turn (concave shape).
            while (bowl.size() >= 2 && 
                   cross(bowl.get(bowl.size() - 2), bowl.get(bowl.size() - 1), p) < 0) {
                bowl.remove(bowl.size() - 1);
            }
            bowl.add(p);
        }

        // The 'bowl' list now contains exactly the points needed, in order.
        // There is no need to calculate the upper hull or reconstruct the full hull.
        
        // Compute the perimeter of the bowl
        double perimeter = 0.0;
        for (int i = 0; i < bowl.size() - 1; i++) {
            perimeter += dist(bowl.get(i), bowl.get(i + 1));
        }

        // Round to the nearest integer and print
        System.out.print(Math.round(perimeter));
        sc.close();
    }
}