/*
 * Problem : 121. Best Time to Buy and Sell Stock (Easy)
 * Link    : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Date    : 2026-11-24
 * Pattern : Greedy / Sliding Window (1-Pass)
 * Time    : O(n) | Space : O(1)
 * Runtime : 2 ms (Beats 50.77%) | Memory : 94.25 MB (Beats 42.26%)
 * Elapsed : -
 */
package array;

class P0121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
