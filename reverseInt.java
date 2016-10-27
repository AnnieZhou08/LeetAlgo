public class Solution {
    public int reverse(int x) {
        int result = reverseone (Math.abs(x));
        
        if (x < 0){
             return result*-1;
        }
        else{
            return result;
        }
        //positive and negative cases
    }
    
    private int reverseone (int x){
        int result = 0;
        
        if (x == 0){
            return result;
        }
        else {
            while (x > 0){
                 if (result < 0 || result > Integer.MAX_VALUE/10 || (result==(Integer.MAX_VALUE/10) && (x%10>Integer.MAX_VALUE%10))){
                    return 0;
                 } //check for overflow
                result = result * 10 + x%10;
                x /= 10;
            }
        }
        return result;
    }

}