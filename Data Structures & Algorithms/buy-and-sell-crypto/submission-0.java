class Solution {
    public int maxProfit(int[] prices) {
        
        var profit = 0;

        for(int i=0; i<prices.length;i++){

           for(int k=i+1; k<prices.length;k++){
            profit = Math.max(profit,prices[k]-prices[i]);
           }
        }

        return profit;
    }
}
