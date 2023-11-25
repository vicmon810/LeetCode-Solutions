package Algorithms.Easy;

public class MoveZeros {

    public static int[] moveZeroes(int[] nums) {
        if (nums.length == 1)
            return nums;

        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        return nums;
    }

    public static void main(String[] args) {
        try {
            int[] test1 = { 0, 1, 0, 3, 12 };
            int[] test2 = { 0 };
            int[] test3 = { 0, 0, 0, 2, 5, 3, 1, 5, 7, 0, 3, 8, };

            for (int num : moveZeroes(test1)) {
                System.out.print(num + " ");
            }
            System.out.println();

            for (int num : moveZeroes(test2)) {
                System.out.print(num + " ");
            }
            System.out.println();

            for (int num : moveZeroes(test3)) {
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
