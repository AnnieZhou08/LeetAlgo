public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int lastPosition(int[] nums, int target) {
        // Write your code here
        if(nums.length == 0 || nums == null) return -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                start = mid;
            }else if(nums[mid] < target){
                start = mid;
            }else if(nums[mid] > target){
                end = mid;
            }
        }
        if(nums[end] == target){
            return end;
        }else if(nums[start] == target){
            return start;
        }
        return -1;
        
    }
}