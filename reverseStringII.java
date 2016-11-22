public class Solution {
    public String reverseString(String s) {
        char [] newstring = s.toCharArray();
        int i = 0; 
        int j = newstring.length-1;
        while (i < j){
            char temp;
            temp = newstring[i];
            newstring[i] = newstring[j];
            newstring[j] = temp;
            i++; j--;
        }
        return String.valueOf(newstring);
    }
}