public class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        
        for (int i = 0; i < 32; i++){
            int counter = 0;
            for(int j = 0; j < nums.length; j++){
                if(((nums[j] >> i) & 1) == 1){
                    counter++;
                    counter %= 3;
                }
            }
            if(counter != 0){
                ans |= counter << i;
            }
        }
        return ans;
    }
}