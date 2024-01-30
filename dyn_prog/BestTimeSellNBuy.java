package dyn_prog;

public class BestTimeSellNBuy {
    public int maxProfit(int[] prices, int fee) {
        int m = prices.length;
        int profit = 0;
        int buyEff = prices[0];
        for (int i = 1; i < m; i++) {
            profit = Math.max(profit, prices[i] - buyEff - fee);
            buyEff = Math.min(buyEff, prices[i] - profit);
        }
        return profit;
    }
}
