public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        one_combination(res, new ArrayList<Integer>(), k, n, 1);
        return res;
        
    }
    public void one_combination(List<List<Integer>> res, List<Integer> sublst, int k, int n, int start){
        
        if (sublst.size() == k && n == 0){
            ArrayList <Integer> li= new ArrayList<Integer>(sublst);
            res.add(li);
            return;
        }
        for (int i = start; i <= 9; i++){
            sublst.add(i);
            one_combination(res, sublst, k, n-i, i+1);
            sublst.remove(sublst.size()-1);
        }
    }
}