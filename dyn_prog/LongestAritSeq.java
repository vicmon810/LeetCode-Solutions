import java.util.HashMap;
import java.util.Map;

public class LongestAritSeq {
    public int longestArithSeqLength(int[] nums) {
        int m = nums.length;
        if (m <= 2)
            return m;

        int longest = 2;

        Map<Integer, Integer>[] dp = new HashMap[m];

        for (int i = 0; i < m; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                int diff = nums[i] - nums[j];
                dp[i].put(diff, dp[j].getOrDefault(diff, 1) + 1);
                longest = Math.max(longest, dp[i].get(diff));
            }
        }
        return longest;
    }
}
