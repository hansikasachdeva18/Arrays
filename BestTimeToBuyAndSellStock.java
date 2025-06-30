Link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

Brute Solution

class Solution {
    public int maxProfit(int[] prices) {
         
        int profit_max = 0;

        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                int profit = prices[j]-prices[i];
                if(profit>profit_max) profit_max=profit;
            }
        }

      return profit_max;
        
    }
        
}
