//You are given an array prices where prices[i] is the price of a given stock 
//on the iᵗʰ day. 
//
// You want to maximize your profit by choosing a single day to buy one stock 
//and choosing a different day in the future to sell that stock. 
//
// Return the maximum profit you can achieve from this transaction. If you 
//cannot achieve any profit, return 0. 
//
// 
// Example 1: 
//
// 
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 
//6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you 
//must buy before you sell.
// 
//
// Example 2: 
//
// 
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
// 
//
// 
// Constraints: 
//
// 
// 1 <= prices.length <= 10⁵ 
// 0 <= prices[i] <= 10⁴ 
// 
//
// Related Topics Array Dynamic Programming 👍 24811 👎 779


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        if (prices.length <= 1) {
            return 0;
        }
        for (int i = 0; i < prices.length - 1; i++) {
            int currMax = maximum(prices, i + 1) - prices[i];
            if (currMax < 0) {
                currMax = 0;
            }

            if ( currMax > max) {
                max = currMax;
            }
        }

        return max;
    }

    public int maximum(int[] arr, int si) {
        int max = Integer.MIN_VALUE;
        for (int i = si; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
