public class Solution {
    public int maxProfit(int[] prices) {
        //Kadane's Algorithm
        int maxCurr = 0;
        int maxSoFar = 0;
        
        for (int i = 1; i < prices.length; i++){
            maxCurr = Math.max(0, maxCurr += prices[i] - prices[i-1]); // if profit falls below 0, resets to 0;
            maxSoFar = Math.max(maxCurr, maxSoFar); //gets the updated max;
        }
        
        return maxSoFar;
        
    }
}