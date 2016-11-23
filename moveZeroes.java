public class Solution {
    public void moveZeroes(int[] nums) {
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                continue;
            } else {
                for (int j = i+1; j < nums.length; j++){
                    
                    if (nums[j] != 0){
                        change (i, j, nums);
                        j = i-1;
                        break;
                    }
                }
            }
        }
        
    }
    private void change (int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}