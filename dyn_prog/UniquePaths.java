package dyn_prog;

public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        return uniquePath(m - 1, n - 1);
    }

    static int uniquePath(int m, int n) {
        if (m < 0 || n < 0)
            return 0;
        else if (m == 0 || m == 0)
            return 1;
        return uniquePath(m - 1, n) + uniquePath(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(uniquePath(3, 7));
    }
}
