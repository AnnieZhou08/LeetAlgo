public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        combos(res, new ArrayList<Integer>(), k, 1 ,n);
        
        return res;
        
    }
    
    public void combos(List<List<Integer>> combinations, List<Integer> subCombs, int k, int start, int n){
        if(k == 0){
            ArrayList<Integer> one_res = new ArrayList<Integer>(subCombs);
            combinations.add(one_res);
            return;
        }
        
        for(int i = start; i <= n; i++){
            subCombs.add(i);
            combos(combinations, subCombs, k-1, i+1, n);
            subCombs.remove(subCombs.size()-1);
        }
    }
}