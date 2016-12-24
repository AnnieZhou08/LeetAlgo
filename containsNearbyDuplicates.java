public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int iterator = 0;
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++){
            if (i > k) s.remove(nums[i-k-1]);
            if (!s.add(nums[i])) return true;
        }
        return false;
    }
}