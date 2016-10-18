//This converts the integer array passed in into an integer
//Adds one to that integer
//Then converts it back to an integer array
//However in the process of array -> int, overflow error occurs when there are more than 9 digits
public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int result = 0;
        
        for (int i = 0; i < length; i++){
            result += digits[i]*(Math.pow(10, length-i-1));
        }
        int number = result+1;
        
        String temp = Integer.toString(number);
        int stringlen = temp.length();
        
        int answer [] = new int[stringlen];
        
        for (int j = 0; j < stringlen; j++){
            answer [j] = temp.charAt(j)-'0';
        }
        
        return answer;
    }
}