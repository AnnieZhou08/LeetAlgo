public class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int holder = nums[0];
        for (int i = 0; i < nums.length-1; i++){
            if (map.get(nums[i]) > Math.floor(nums.length/2)){
                holder = nums[i];
                return holder;
            }
        }
        return holder;
    }
}