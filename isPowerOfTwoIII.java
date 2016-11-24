public class Solution {
    public boolean isPowerOfTwo(int n) {
       return n <= 0 ? false : n == Math.pow (2, (int)(Math.log (n) / Math.log (2))); 
    }
}