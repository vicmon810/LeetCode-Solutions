package dyn_prog;

public class MaxSquirt {

    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int c = 0; c < n; c++) {
                if (i == 0 || c == 0) {
                    if (matrix[i][c] == '1')
                        dp[i][c] = 1;
                } else {
                    if (matrix[i][c] == '1') {
                        dp[i][c] = Math.min(dp[i - 1][c], Math.min(dp[i][c - 1], dp[i - 1][c - 1])) + 1;
                    }
                }
                ans = Math.max(ans, dp[i][c]);
            }
        }
        return ans * ans;

    }
}
