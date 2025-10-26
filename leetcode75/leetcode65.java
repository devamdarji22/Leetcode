// 🧩 Problem: Best Time to Buy and Sell Stock with Transaction Fee
// 🔗 Link   : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        int profit = 0;
        int effBuy = -prices[0];
        for(int i = 1;i<len;i++){
            profit = Math.max(
                    profit,
                    prices[i] + effBuy - fee
            );
            effBuy = Math.max(
                    effBuy,
                    profit - prices[i]
            );
        }
        return profit;
    }
}