public class Solution {
    public int addDigits(int num) {
        int result = 0;
        if (num>=0 && num <= 9){
            return num;
        }
        else {
            while (num > 0){
                result += num%10;
                num = num/10;
            }
            result = addDigits(result);
            return result;
        }
    }
}