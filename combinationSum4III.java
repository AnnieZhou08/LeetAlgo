public class Solution {
    public int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target+1];
        dp[0] = 1;
        if(target == 0){
            return dp[target];
        }
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(i >= nums[j]){
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }
}