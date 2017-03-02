public class Solution {
    int counter = 0;
    public int findTargetSumWays(int[] nums, int S) {
        canSum(nums, 0, 0, S);
        return counter;
    }
    
    public void canSum(int[] nums, int start, int now, int target){
        
        if(now == target && start == nums.length){
            counter++;
        }
        if(start == nums.length){
            return;
        }
        canSum(nums, start+1, now+nums[start], target);
        canSum(nums, start+1, now-nums[start], target);
        
    }
}