public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n:nums){
            set.add(n);
        }
        
        return set.size() != nums.length;
        
    }
}