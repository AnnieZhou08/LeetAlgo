public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int lastPosition(int[] nums, int target) {
        // Write your code here
        
        int low = 0;
        int high = nums.length-1;
        int index = -1;
        
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                index = Math.max(mid, index);
                low = mid+1;
            }else if (nums[mid] < target){
                low = mid+1;
            }else if (nums[mid] > target){
                high = mid-1;
            }
        }
        
        return index;
        
    }
}