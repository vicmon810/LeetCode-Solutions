package Algorithms.Easy;

public class LargestAlt {
    public static int largestAltitude(int[] gain) {

        int max = 0;
        int sum = 0;

        for (int i = 0; i < gain.length; i++) {
            sum += gain[i];
            max = Math.max(max, sum);
        }

        return max;

    }

    public static void main(String[] args) {
        try {
            int[] test1 = { -5, 1, 5, 0, -7 };
            int[] test2 = { -4, -3, -2, -1, 4, 3, 2 };
            int[] test3 = { 1, 5, 3, -7, 6, -6 };

            System.out.println(largestAltitude(test1));
            System.out.println(largestAltitude(test3));
            System.out.println(largestAltitude(test2));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
