package dyn_prog;

public class UniquePath2 {
    static int[][] grid;
    static Integer[][] cache;

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        grid = obstacleGrid;
        int m = grid.length;
        int n = grid[0].length;
        cache = new Integer[m][n];
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1)
            return 0;
        return helper(0, 0);
    }

    private static int helper(int row, int col) {
        if (row >= grid.length || col >= grid[0].length)
            return 0;
        if (grid[row][col] == 1)
            return 0;
        if (row == grid.length - 1 && col == grid.length - 1)
            return 1;
        if (cache[row][col] != null)
            return cache[row][col];
        int down = helper(row + 1, col);
        int right = helper(row, col + 1);
        cache[row][col] = down + right;
        return cache[row][col];
    }

    public static void main(String[] args) {
        int[][] test = { { 0, 0 }, { 1, 1 }, { 0, 0 } };
        System.out.println(uniquePathsWithObstacles(test));
    }
}
