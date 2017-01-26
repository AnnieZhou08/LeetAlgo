public class Solution {
    public boolean PredictTheWinner(int[] nums) {
        return score(nums, 0, nums.length-1) >= 0;
        
    }
    public int score(int[] nums, int start, int end){
        if(start == end) return nums[start];
        
        return Math.max(nums[start] - score(nums, start+1, end),  nums[end] - score(nums, start, end-1));
    }
}