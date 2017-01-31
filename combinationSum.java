public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        one_combo(res, new ArrayList<Integer>(), target, candidates, 0);
        
        return res;
        
    }
    public void one_combo(List<List<Integer>> res, List<Integer> comb, int target, int[] candidates, int start){
        if(target < 0){
            return;
        }
        else if(target == 0){
            ArrayList<Integer> li = new ArrayList<Integer>(comb);
            res.add(li);
            return;
        }
        else{
            for(int i = start; i < candidates.length && target >= candidates[i]; i++){
                comb.add(candidates[i]);
                one_combo(res, comb, target-candidates[i], candidates, i);
                comb.remove(comb.size()-1);
            }
        }
        
    }
}