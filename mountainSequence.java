public class Solution {
    /**
     * @param nums a mountain sequence which increase firstly and then decrease
     * @return then mountain top
     */
    public int mountainSequence(int[] nums) {
        // Write your code here
        if(nums.length == 0 || nums == null) return 0;
        
        int start = 0;
        int end = nums.length-1;
        
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            
            if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid]){
                return nums[mid];
            }else if (nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                start = mid;
            }else if (nums[mid-1] > nums[mid] && nums[mid] > nums[mid+1]){
                end = mid;
            }
        }
        
        if(nums[end] > nums[start]){
            return nums[end];
        }
        return nums[start];
    }
}

public class Solution {
    /**
     * @param nums a mountain sequence which increase firstly and then decrease
     * @return then mountain top
     */
    public int mountainSequence(int[] nums) {
        // Write your code here
        int start = 0;
        int end = nums.length - 1;
        
        while (start + 1 < end){
            int mid = start + (end - start)/2;
            
            if(nums[mid-1] < nums[mid] && nums[mid+1] < nums[mid]){
                return nums[mid];
            }else if(nums[mid-1] <= nums[mid] && nums[mid] <= nums[mid+1]){
                start = mid;
            }else if(nums[mid-1] >= nums[mid] && nums[mid] >= nums[mid+1]){
                end = mid;
            }
        }
        return nums[start] > nums[end] ? nums[start] : nums[end];
    }
}