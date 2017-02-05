public class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> all_res = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < all_res.size(); j++){
                List<Integer> lst = all_res.get(j);
                if(nums[i] % lst.get(lst.size()-1) == 0){
                    all_res.get(j).add(nums[i]);
                    all_res.add(lst);
                }
            }
            ArrayList<Integer> newlst = new ArrayList<Integer>();
            newlst.add(nums[i]);
            all_res.add(newlst);
        }
        
        int max_size = 0;
        List<Integer> res = new ArrayList<Integer>();
        
        for(List<Integer> l : all_res){
            if(l.size() > max_size){
                res = l;
                max_size = l.size();
            }
        }
        return res;
    }
}