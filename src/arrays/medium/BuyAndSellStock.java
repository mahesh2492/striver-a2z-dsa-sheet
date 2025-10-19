package arrays.medium;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int max = 0, profit;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j <= prices.length - 1; j++) {
                if (prices[i] < prices[j]) {
                    profit = Math.abs(prices[j] - prices[i]);
                    max = Math.max(max, profit);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};
        System.out.println("Max Profit: " + maxProfit(prices));
        System.out.println("Max Profit: " + maxProfit(prices2));
    }
}
