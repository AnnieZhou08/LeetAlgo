public class Solution {
    public int addDigits(int num) {
        int result = num%9;
        if (result == 0){
            if (num > 0){
                return 9;
            }
            return 0;
        }
        else {
            return result;
        }
    }
}