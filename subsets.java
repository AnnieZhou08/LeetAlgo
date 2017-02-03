public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        one_set(res, new ArrayList<Integer>(), nums, 0);
        
        return res;
    }
    public void one_set(List<List<Integer>> res, List<Integer> sub, int[]nums, int start){
        
        res.add(new ArrayList<Integer>(sub));
        
        for(int i = start; i < nums.length; i++){
            sub.add(nums[i]);
            System.out.println(sub);
            one_set(res, sub, nums, i+1);
            sub.remove(sub.size()-1);
        }
        
    }
}