public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        
        while (j<nums.length){
            if (nums[j]==val){
                while (j < nums.length && nums[j] == val){
                    j++;
                }
                if (j<nums.length){
                    nums[i++] = nums[j++];
                }
            }
            else{
                nums[i++] = nums [j++];
            }
        }
        return i;
    }
}