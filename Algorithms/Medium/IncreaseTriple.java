package Algorithms.Medium;

public class IncreaseTriple {

    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= max1)
                max1 = n;
            else if (n <= max2)
                max2 = n;
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            // int[] test1 = { 1, 2, 3, 4, 5, 6 };
            int[] test2 = { 2, 3, 1,0, 1, 8 };
            // System.out.println(increasingTriplet(test1));
            System.out.println(increasingTriplet(test2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
