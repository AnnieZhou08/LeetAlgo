public class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0;
        
        for (int i = 1; i < nums.length; i++){
            if (nums[i]!=nums[result]){
                nums[++result] = nums[i];
            }
        }
        
        return ++result;
    }
}