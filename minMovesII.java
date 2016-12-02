public class Solution {
    public int minMoves(int[] nums) {
        //find mininum number of the array
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < min){
                min = nums[i];
            }
        }
        int result = 0;
        for (int n : nums){
            result += n - min;
        }
        return result;
    }
}