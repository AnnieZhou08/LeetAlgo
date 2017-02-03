public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        one_res(res, new ArrayList<Integer>(), nums, 0);
        
        return res;
    }
    
    public void one_res(List<List<Integer>> res, List<Integer> sub, int[]nums, int start){
        
        res.add(new ArrayList<Integer>(sub));
        
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            sub.add(nums[i]);
            one_res(res, sub, nums, i+1);
            sub.remove(sub.size()-1);
        }
    }
}