package day1;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int[] left = new int[prices.length];
        int[] right = new int[prices.length];
        int profit = 0;
        left[0] = prices[0];
        for(int i = 1;i <= prices.length - 1;i++) {
            left[i] = Math.min(left[i-1], prices[i]);
        }
        right[prices.length - 1] = prices[prices.length - 1];
        for(int i = prices.length - 2;i >= 0;i--) {
            right[i] = Math.max(right[i+1], prices[i]);
            profit = Math.max(profit, right[i] - left[i]);
        }
        return profit;
    }
}