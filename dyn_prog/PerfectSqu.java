package dyn_prog;

public class PerfectSqu {

    public static int numSquares(int n) {
        // divider the n
        int[] cache = new int[n + 1];

        cache[0] = 0;

        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int factor = 1;
            while (i - factor * factor >= 0) {
                min = Math.min(min, cache[i - factor * factor] + 1);
                factor++;
            }
            cache[i] = min;
        }
        return cache[n];
    }

    public static void main(String[] args) {
        numSquares(12);
    }
}
