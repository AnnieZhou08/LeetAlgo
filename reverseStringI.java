public class Solution {
    public String reverseString(String s) {
        String newstring = "";
        int length = s.length();
        for (int i = length-1; i >= 0; i--){
            newstring += s.charAt(i);
        }
        return newstring;
    }
}