package dyn_prog;

public class DeleteAndEarn {

    public static int deleteAndEarn(int[] nums) {
        int n = 10;
        int[] value = new int[n];

        for (int num : nums) {
            value[num] += num;
        }

        int take = 0, skip = 0;

        for (int i = 0; i < n; i++) {
            int takei = skip + value[i];
            int skipi = Math.max(skip, take);
            take = takei;
            skip = skipi;
        }
        return Math.max(take, skip);
    }

    public static void main(String[] args) {
        int[] test = { 1, 2, 5, 4, 6,6 };
        deleteAndEarn(test);
    }
}
