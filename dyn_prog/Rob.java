package dyn_prog;

public class Rob {
    public static int rob(int[] nums) {
        int p = 0, c = 0;
        for (int n : nums) {
            final int temp = Integer.max(p + n, c);
            p = c;
            c = temp;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] test = { 1, 2, 3, 1 };
        rob(test);
    }
}
