public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) return false;
        
        int min = nums[0];
        int med = -1;
        
        for (int i = 1; i < nums.length; i++){
            if(nums[i] <= min){
                min = nums[i];
            }else if (nums[i] > min && nums[i] <= med || nums[i] > min && med == -1){
                med = nums[i];
            }else if (nums[i] > med && med != -1){
                return true;
            }
        }
        
        return false;
    }
}