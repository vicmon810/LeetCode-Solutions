import java.util.Arrays;;

public class IncreasePair {

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        int m = pairs.length;
        int n = pairs[0].length;
        int counter = 1;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (pairs[i][n - 1] < pairs[j][0]) {
                    counter++;
                    i = j;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[][] test = { { 1, 2 }, { 7, 8 }, { 4, 5 } };
        System.out.println(findLongestChain(test));
    }
}
