public class Solution {
    public boolean isPalindrome(int x) {
        int reversednum = reverse (x);
        if (reversednum == x){
            return true;
        }
        return false;
    }
    private int reverse (int x) {
        int result = 0;
        while (x > 0){
            result = 10*result + x%10;
            x = x/10;
        }
        return result;
    }
}