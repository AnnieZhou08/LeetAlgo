public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        
        one_combo(candidates, 0, target, res, new ArrayList<Integer>());
        
        return res;
    }
    
    public void one_combo(int[]candidates, int start, int target, List<List<Integer>> res, List<Integer> comb){
        if(target == 0){
            ArrayList<Integer> combined = new ArrayList<Integer>(comb);
            res.add(combined);
            return;
        }else if (target < 0){
            return;
        }
        for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                if(i > start && candidates[i] == candidates[i-1]) continue;
                comb.add(candidates[i]);
                one_combo(candidates, i+1, target-candidates[i], res, comb);
                comb.remove(comb.size()-1);
        }
    }
}