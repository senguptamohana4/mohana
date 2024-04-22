package Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LockPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grid_size = sc.nextInt();
        int pattern_size = sc.nextInt();

        List<int[]> pattern = new ArrayList<>();
        for (int i = 0; i < pattern_size; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            pattern.add(new int[]{x, y});
        }

        if (isValidPattern(grid_size, pattern)) {
            double coverage = calculateCoverage(grid_size, pattern);
            if (coverage > 75) {
                System.out.println("Excellent");
            } else if (coverage > 50) {
                System.out.println("Good");
            } else if (coverage > 25) {
                System.out.println("Average");
            } else {
                System.out.println("Poor");
            }
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isValidPattern(int grid_size, List<int[]> pattern) {
        boolean[][] grid = new boolean[grid_size][grid_size];

        // Mark pattern points on the grid
        for (int[] point : pattern) {
            int x = point[0] - 1;
            int y = point[1] - 1;
            grid[x][y] = true;
        }

        // Check if each point connects to its adjacent neighbors
        for (int i = 0; i < pattern.size() - 1; i++) {
            int[] point1 = pattern.get(i);
            int[] point2 = pattern.get(i + 1);
            int x1 = point1[0] - 1;
            int y1 = point1[1] - 1;
            int x2 = point2[0] - 1;
            int y2 = point2[1] - 1;
            if (Math.abs(x1 - x2) > 1 || Math.abs(y1 - y2) > 1) {
                return false;
            }
        }
        return true;
    }

    public static double calculateCoverage(int grid_size, List<int[]> pattern) {
        int total_points = grid_size * grid_size;
        int covered_points = pattern.size();
        double coverage_percentage = ((double) covered_points / total_points) * 100;
        return coverage_percentage;
    }
}