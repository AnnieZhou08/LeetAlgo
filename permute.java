public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        permutations(res, new ArrayList<Integer>(), nums, 0);
        
        return res;
        
    }
    
    public void permutations(List<List<Integer>> res, List<Integer> perm, int[]nums, int start){
        
        if(perm.size() == nums.length){
            List<Integer> one_res = new ArrayList<Integer>(perm);
            res.add(one_res);
            return;
        }
        
        for(int i = 0; i <= perm.size(); i++){
            List<Integer> new_perm = new ArrayList<Integer>(perm);
            new_perm.add(i, nums[start]);
            permutations(res, new_perm, nums, start+1);
        }
        
        
    }
}