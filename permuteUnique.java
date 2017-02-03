public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        permutations(res, new ArrayList<Integer>(), used, nums);
        
        return res;
    }
    
    public void permutations(List<List<Integer>> res, List<Integer> perm, boolean[]used, int[]nums){
        
        if(perm.size() == nums.length){
            List<Integer> one_res = new ArrayList<Integer>(perm);
            res.add(one_res);
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;
            used[i] = true;
            perm.add(nums[i]);
            permutations(res, perm, used, nums);
            used[i] = false;
            perm.remove(perm.size()-1);
               
        }
    }
}