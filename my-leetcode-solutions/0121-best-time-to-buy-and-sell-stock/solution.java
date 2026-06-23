class Solution {
    public int maxProfit(int[] prices) {
        int i = 1;
        int profit = 0;
        int minprices = prices[0];
        int n = prices.length;
        while(i<n)
        {
            if(minprices>prices[i])
            {
                minprices = prices[i];

            }
            else
            {
                profit = Math.max(profit,prices[i] - minprices);
            }
            i++;
        }
        return profit;
    }
}
