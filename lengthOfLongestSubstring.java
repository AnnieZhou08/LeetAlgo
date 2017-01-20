public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        HashSet<Character> set = new HashSet<Character> ();
        
        while(end < s.length()){
            char c = s.charAt(end);
            if(!set.contains(c)){
                set.add(c);
                end++;
                max = Math.max(max, set.size());
            }else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}