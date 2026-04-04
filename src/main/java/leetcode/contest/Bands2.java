package leetcode.contest;

import java.util.*;

// Using a record for a simple Point class with automatic equals(), hashCode(), etc.
record Point(int r, int c) {}

public class Bands2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read all inputs
        int s = sc.nextInt();
        Point start1 = new Point(sc.nextInt(), sc.nextInt());
        String pathStr1 = sc.next();
        Point start2 = new Point(sc.nextInt(), sc.nextInt());
        String pathStr2 = sc.next();
        sc.close();

        // 1. Generate the ordered list of cells for each band's path
        List<Point> band1Path = generatePath(start1, pathStr1);
        List<Point> band2Path = generatePath(start2, pathStr2);

        // 2. Check for enclosure (linkage)
        boolean b1_inside_b2 = isInside(start1, band2Path);
        boolean b2_inside_b1 = isInside(start2, band1Path);

        if (b1_inside_b2 || b2_inside_b1) {
            System.out.print("Impossible");
        } else {
            // 3. If not linked, calculate the number of overlapping cells
            Set<Point> band1Cells = new HashSet<>(band1Path);
            Set<Point> band2Cells = new HashSet<>(band2Path);

            // Find the intersection of the two sets
            band1Cells.retainAll(band2Cells);

            System.out.print(band1Cells.size());
        }
    }

    /**
     * Generates a list of all coordinates a band occupies by following its path string.
     */
    public static List<Point> generatePath(Point start, String pathStr) {
        List<Point> path = new ArrayList<>();
        int r = start.r();
        int c = start.c();

        // The path occupies N cells for a path string of length N
        for (char move : pathStr.toCharArray()) {
            path.add(new Point(r, c));
            switch (move) {
                case 'u' -> r--;
                case 'd' -> r++;
                case 'l' -> c--;
                case 'r' -> c++;
            }
        }
        return path;
    }

    /**
     * Checks if a point is inside a polygon using the Ray Casting algorithm.
     * The polygon is defined by the ordered list of cells its path occupies.
     */
    public static boolean isInside(Point testPoint, List<Point> polygonPath) {
        int intersections = 0;
        int pathSize = polygonPath.size();

        for (int i = 0; i < pathSize; i++) {
            Point p1 = polygonPath.get(i);
            // The next point in the path, wrapping around at the end
            Point p2 = polygonPath.get((i + 1) % pathSize);

            // We only care about vertical edges for our horizontal ray
            if (p1.c() == p2.c() && p1.c() > testPoint.c()) {
                // Check if the ray crosses the vertical segment
                if ((p1.r() <= testPoint.r() && p2.r() > testPoint.r()) ||
                        (p2.r() <= testPoint.r() && p1.r() > testPoint.r())) {
                    intersections++;
                }
            }
        }
        // If the number of intersections is odd, the point is inside.
        return intersections % 2 == 1;
    }
}
