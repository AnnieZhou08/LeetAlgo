public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry =  0;
        
        for (int i = num1.length()-1, j = num2.length()-1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int c = x + y + carry;
            if (c > 9){
                carry = 1;
            } else {
                carry = 0;
            }
            sb.append(c%10);
        }
        return sb.reverse().toString();
        
    }
}