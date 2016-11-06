public class Solution {
    public int climbStairs(int n) {
        int[] result = new int [n+1];
        
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2){
                result [i] = i;
            }
            else{
                result [i] = result [i-1] + result [i-2];
            }
        }

        return result[n];
    }
}