package dyn_prog;

public class BTS {
    static Integer[] dp;

    public static int numTrees(int n) {
        dp = new Integer[n + 1];
        return helper(n);
    }

    static int helper(int n) {
        if (n < 2)
            return 1;

        if (dp[n] != null)
            return dp[n];

        int total = 0;

        for (int i = 1; i <= n; i++) {
            int left = i - 1;
            int leftTotal = helper(left);
            int right = n - i;
            int rightTotal = helper(right);
            total += (leftTotal * rightTotal);
        }

        dp[n] = total;
        return total;
    }

    public static void main(String[] args) {
        numTrees(3);
    }
}
