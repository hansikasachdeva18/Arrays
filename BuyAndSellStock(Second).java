class Solution {
    public int maxProfit(int[] prices) {
        int total_profit=0;
        for(int i=1;i<prices.length;i++){
        int profit = prices[i]-prices[i-1];
        if(profit>0){
            total_profit=profit+total_profit;
        }
    }


    return total_profit;
    }
}
