public class Solution {
    public int arrangeCoins(int n) {
        double k = (double) n;
        int result = (int) Math.floor (((Math.sqrt(1+8*k)-1)/2));
        return result;
    }
}