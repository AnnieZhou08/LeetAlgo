public class Solution {
   
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length == 0){
            return res;
        }
        int k = 0; 
        for(int i = 0; i < nums.length; i++){
            List<Integer> curr_seq = new ArrayList<Integer>();
            curr_seq.add(nums[i]);
            res.add(curr_seq);
            int count = 1;
            for(int j = 0; j < k; j++){
                List<Integer> seq = res.get(j);
                int last_num = seq.get(seq.size()-1);
                
                if(nums[i] >= last_num){
                    List<Integer> new_seq = new ArrayList<Integer>();
                    for (int n : seq){
                        new_seq.add(n);
                    }
                    new_seq.add(nums[i]);
                    res.add(new_seq);
                    count++;
                }
            }
            k+= count;
        }
        HashSet<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i = 0; i < res.size(); i++){
            if(res.get(i).size() >= 2){
                set.add(res.get(i));
            }
        }
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(List<Integer> entry : set){
            result.add(entry);
        }
        return result;
    }
}
