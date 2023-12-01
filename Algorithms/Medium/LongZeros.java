public class LongZeros {

    public static int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;

        while (nums.length > end) {
            if (nums[end] == 0)
                zeros++;

            end++;

            if (zeros > k) {
                if (nums[start] == 0)
                    zeros--;

                start++;
            }
        }
        return end - start;
    }

    public static void main(String[] args) {
        try {
            int[] test1 = { 1, 1, 1, 0, 0, 0, 1 };
            System.out.println(longestOnes(test1, 3));
            int[] test2 = { 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };
            System.out.println(longestOnes(test2, 1));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
