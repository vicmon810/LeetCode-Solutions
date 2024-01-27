package dyn_prog;

import java.util.Arrays;

public class RussianDoll {
    public static int maxEnvelopes(int[][] envelopes) {
        int n = envelopes.length, len = 0;

        // We sort According to Width!!
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

        int dp[] = new int[n];
        for (int[] envelope : envelopes) {
            int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
            if (index < 0)
                index = -(index + 1);
            dp[index] = envelope[1];
            if (index == len)
                len++;
        }

        return len;
    }

    public static void main(String[] args) {
        int[][] test = { { 1, 2 }, { 2, 3 }, { 90, 11 }, { 12, 31 } };
        maxEnvelopes(test);
    }
}
