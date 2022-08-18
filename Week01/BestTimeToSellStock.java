package Week01;

class SolutionBestTimeToSellStock {
    public int maxProfit(int[] prices) {
        int lowest = prices[0];
        int highestDiff = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= lowest) {
                lowest = prices[i];
            } else {
                if (highestDiff < prices[i] - lowest)
                    highestDiff = prices[i] - lowest;
            }
        }
        return highestDiff;
    }
}

public class BestTimeToSellStock {
    public static void main(String[] args) {
        SolutionBestTimeToSellStock solution = new SolutionBestTimeToSellStock();
        // Test case goes here
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(solution.maxProfit(prices));
    }
    // Runtime: 2 ms, faster than 93.59% of Java online submissions for Best Time to
    // Buy and Sell Stock.
    // Memory Usage: 59.2 MB, less than 88.54% of Java online submissions for Best
    // Time to Buy and Sell Stock.
    // Pretty satisfy with the result
}