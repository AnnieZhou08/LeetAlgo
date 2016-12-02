public class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        while  (!isequal(nums)){
            addone(nums);
            count++;
            Arrays.sort(nums);
        }
        return count;
    }
    private boolean isequal(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i+1] == nums[i]){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    private int[] addone(int[] nums){
        for (int i = 0; i < nums.length-1; i++){
            nums[i]+= 1;
        }
        return nums;
    }
}