public class Solution {
     public int trailingZeroes(int n) {
        
        int k = 5*(int)Math.floor(n/5);
        int result = 0;
        if (k <= 0){
            return result;
        }
        else {
            result = numfives(k) + trailingZeroes(k-5);
        }
        
        return result;
    }
    
    private int numfives (int n){
        int result = 0;
        if (n%5 != 0){
            return result;
        }
        else {
            result = 1 + numfives (n/5);
        }
        return result;
    }
}