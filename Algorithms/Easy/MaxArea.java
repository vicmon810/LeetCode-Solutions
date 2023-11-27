package Algorithms.Easy;

public class MaxArea {

    public static int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int area = (right - left) * Math.min(height[right], height[left]);
            max_area = Math.max(max_area, area);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }

        return max_area;
    }

    public static void main(String[] args) {
        try {
            int[] test1 = { 1, 2, 7, 8, 1 };
            int[] test2 = { 1, 1 };
            int[] test3 = { 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 11, 1, };
            System.out.println(maxArea(test1));
            System.out.println(maxArea(test2));
            System.out.println(maxArea(test3));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
