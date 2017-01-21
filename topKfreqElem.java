public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        ArrayList<Integer>[] freq = new ArrayList[nums.length];
        
        //populate freq
        for(int a = 0; a < freq.length; a++){
            freq[a] = new ArrayList<Integer>();
        }
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        if(nums.length == 0) return res;
        
        Arrays.sort(nums);
        int currFreq = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                freq[currFreq].add(nums[i-1]);
                currFreq = 1;
            }else{
                currFreq++;
            }
        }
        currFreq++;
        freq[currFreq-1].add(nums[nums.length-1]);
        for(int j = freq.length-1; j >= 0; j--){
           for(int l = 0; l < freq[j].size(); l++){
               if(k == 0){
                   break;
               }else{
                  res.add(freq[j].get(l));
                  k--;
               }
           }
        }
        
        return res;
    }
}