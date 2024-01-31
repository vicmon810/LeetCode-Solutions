package dyn_prog;

/**
 * BestTImeSellNBuy4
 */
public class BestTImeSellNBuy4 {

    public int maxProfit(int k, int[] prices) {
        int m = prices.length;
        int[][] dp = new int[k + 1][m];

        if (m < 2 || k == 0)
            return 0;

        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = Math.max(dp[i][j - 1], helper(i, j, prices, dp));
            }
        }
        return dp[k][m - 1];
    }

    int helper(int k, int x, int[] prices, int[][] dp) {
        int max = 0;
        for (int i = 0; i < x; i++) {
            max = Math.max(max, prices[x] - prices[i] + dp[k - 1][i]);
        }
        return max;
    }
}