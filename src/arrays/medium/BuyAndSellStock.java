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

    /*
         Optimized approach
     */
    public static int maxProfitOptimal(int[] prices) {
        int minimumCost = prices[0], maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minimumCost) {
                    minimumCost = prices[i];
                }

            maxProfit = Math.max(prices[i] - minimumCost, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int[] prices2 = {1, 2};
        System.out.println("Max Profit: " + maxProfit(prices));
        System.out.println("Max Profit: " + maxProfit(prices2));

        System.out.println("Max Profit: " + maxProfitOptimal(prices));
        System.out.println("Max Profit: " + maxProfitOptimal(prices2));
    }
}
