class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for(int i=1; i<prices.length; i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }else if(prices[i] - buyPrice > profit){
                profit = prices[i] - buyPrice;
            }
        }
        return profit;
    }
}