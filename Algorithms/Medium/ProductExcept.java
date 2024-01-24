package Algorithms.Medium;

public class ProductExcept {

    public static int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * prefix[i - 1];
            System.out.println(prefix[i]);
            System.out.println("--");
        }
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            prefix[i] = prefix[i] * suffix;
            suffix = suffix * nums[i];
            System.out.println(suffix);
            System.out.println("----");
        }

        return prefix;
    }

    public static void main(String[] args) {
        try {
            int[] test = { 1, 2, 3, 4 };
            for (int c : productExceptSelf(test)) {
                System.out.println(c);

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
