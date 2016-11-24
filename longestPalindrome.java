public class Solution {
    public int longestPalindrome(String s) {
        Boolean haveOdd = false;
        int count = 0;
        HashMap<Character, Integer> alphabets = new HashMap<Character, Integer> ();
        
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (alphabets.containsKey(c)){
                alphabets.put(c, alphabets.get(c)+1);
            } else {
                alphabets.put(c, 1);
            }
        }
        for (char d : alphabets.keySet()){
            if (alphabets.get(d)%2 == 0){
                count+=alphabets.get(d);
            } else {
                haveOdd = true;
                count += alphabets.get(d)-1;
            }
        }
        if (haveOdd == true){
            count++;
        }
        return count;
    }
}