class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = Integer.MIN_VALUE;
        for(int price : prices)
        {
            int currProfit = price - min;
            maxProfit = Math.max(currProfit,maxProfit);
            min = Math.min(min,price);
        }
        return maxProfit;
        
    }
}