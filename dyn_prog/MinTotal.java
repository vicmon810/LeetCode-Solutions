package dyn_prog;

import java.util.List;

public class MinTotal {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int sum = 0, min = 0;

        sum += triangle.get(0).get(0);

        for (int i = 1; i < triangle.size(); i++) {
            min = triangle.get(i).get(0);
            for (int j = 1; j < triangle.get(i).size(); j++) {
                if (triangle.get(i).get(j) < min)
                    min = triangle.get(i).get(j);

            }
            sum += min;
        }

        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(
                List.of(-1),
                List.of(2, 3),
                List.of(1, -1, -3));
        System.out.println(minimumTotal(listOfLists));
    }

}
