public class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.lastIndexOf(' '); //finds the index of the last space character
        int counter = 0;
        
        if (i < 0){
           for (int j = 0; j < s.length(); j++){
               counter++;
           }
        } //if there are no spaces, just finds the length of this word
        else{
            if (i == s.length()-1){
                counter = lengthOfLastWord(s.substring(0,i));
            } //if word ends off with a space, pass a new word in without the last space
            for(int j = i+1; j < s.length(); j++){
                counter++;
            } //if word doesn't end off with space, counts the letters from the letter right after space to the end
        }
        return counter;
    }
}