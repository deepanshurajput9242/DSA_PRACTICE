class Solution {
    public int maxProfit(int[] prices) {

        int minProfit=prices[0];
        int maxProfit=0;
        int profit=0;
        for(int stockPrices:prices){
            minProfit=Math.min(stockPrices,minProfit);
            profit=stockPrices-minProfit;
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}