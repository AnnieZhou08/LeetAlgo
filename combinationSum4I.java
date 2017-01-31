public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int count = 0;
        
        if(target == 0){
            return 1;
        }else if (target < 0){
            return 0;
        }
        for(int i = 0; i < nums.length; i++){
            count += combinationSum4(nums, target - nums[i]);
        }
        
        return count;
    }
}