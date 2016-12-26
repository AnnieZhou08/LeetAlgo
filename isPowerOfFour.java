public class Solution {
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        
        return num == (int)Math.pow(4, (int)(Math.log(num)/Math.log(4)));
    }
}