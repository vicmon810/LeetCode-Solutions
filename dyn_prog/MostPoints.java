package dyn_prog;

import java.util.Arrays;

public class MostPoints {
    public long mostPoints(int[][] questions) {
        int m = questions.length;
        long[] dp = new long[m];
        Arrays.fill(dp, -1l);
        return helper(0, dp, questions);
    }

    long helper(int index, long[] dp, int[][] questions) {
        if (index >= questions.length)
            return 0;

        if (dp[index] != -1l)
            return dp[index];

        long take = questions[index][0] + helper(index + questions[index][1] + 1, dp, questions);
        long notake = helper(index + 1, dp, questions);
        dp[index] = Math.max(take, notake);
        return dp[index];
    }
}
