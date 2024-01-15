package LinkedList;

public class Middle {

    public static int kthFactor(int n, int k) {
        int x = (int) Math.sqrt(n);
        for (int i = 1; i < x; ++i) {
            if (n % i == 0 && --k == 0)
                return i;
        }
        for (int i = (int) x; i >= 1; --i) {
            if (n % (n / i) == 0 && --k == 0)
                return n / i;
        }
        return -1;
    }

    public static void main(String[] args) {
        kthFactor(4, 4);
        kthFactor(12, 3);
    }
}
