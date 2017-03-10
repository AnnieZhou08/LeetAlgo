public class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxsofar = nums[0];
        int maxtoend = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            maxtoend = Math.max(maxtoend + nums[i], nums[i]);
            maxsofar = Math.max(maxsofar, maxtoend);
        }
        
        return maxsofar;
        
    }
}