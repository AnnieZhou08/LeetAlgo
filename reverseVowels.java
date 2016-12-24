public class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while (i <= j){
            if (isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                 char temp = sb.charAt(i);
                 sb.setCharAt(i, sb.charAt(j));
                 sb.setCharAt(j, temp);
                 i++; 
                 j--;
            } else if (isVowel(s.charAt(i))){
                j--;
            } else if (isVowel(s.charAt(j))){
                i++;
            } else {
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    private Boolean isVowel (char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}