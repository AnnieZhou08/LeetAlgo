public class Solution {
    public int rob(int[] nums) {
        
        int include = 0;
        int exclude = 0;
        
        for (int i = 0; i < nums.length; i++){
            int prevInclude = include;
            include = nums[i] + exclude;
            exclude = Math.max(prevInclude, exclude);
        }
        
        return Math.max(exclude, include);
        
    }
}