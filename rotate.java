public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] temp = new int[nums.length-k];
        for (int i = 0; i < temp.length; i++){
            temp[i] = nums[i];
        }
        
        for (int i = 0; i < nums.length; i++){
            if (i-k < 0){
                nums[i] = nums[nums.length + (i-k)];
            } else {
                nums[i] = temp[i-k];
            }
            
        }
    }
}