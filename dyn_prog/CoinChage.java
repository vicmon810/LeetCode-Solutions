package dyn_prog;
fda
public class CoinChage {

    public static int change(int amount, int[] coins) {
        int[] cache = new int[amount + 1];
        cache[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j < amount + 1; j++) {
                if (j - coins[i] >= 0)
                    cache[j] = cache[j] + cache[j - coins[i]];
            }
        }
        ##

        return cache[amount];
    }

    public static void main(String[] args) {
        int[] coins = {1,2,5};
        change(5, coins);
    }

}
