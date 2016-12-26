public class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;
        for (int i = 0; i < s.length(); i++){
            result += (t.charAt(i) - 'a') - (s.charAt(i) - 'a');
        }
        result += t.charAt(t.length()-1) - 'a';
        
        return (char)(result + 'a');
    }
}