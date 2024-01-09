import java.util.ArrayList;
import java.util.List;

public class LongestSubArray {

    public static int longestSubarray(int[] nums) {
        int count = 0;
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {

                if (count > 0) {
                    num.add(count);
                    count = 0;
                }
                num.add(0);

            } else {
                count++;
            }

        }

        num.add(count);

        if (num.size() == 1) {

            return nums.length - 1;

        }

        if (num.size() == 2) {

            return Math.max(num.get(0), num.get(1));

        }

        int max = 0;

        for (int i = 0; i < num.size() - 2; i++) {

            max = Math.max(max, num.get(i) + num.get(i + 2));

        }

        return max;

    }

    public static void main(String[] args) {
        try {
            int[] test1 = { 1, 1, 0, 1 };
            int[] test2 = { 0, 1, 1, 1, 0, 1, 1, 0, 1 };

            System.out.println(longestSubarray(test1));
            System.out.println(longestSubarray(test2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
