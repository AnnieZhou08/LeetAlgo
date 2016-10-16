public class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.lastIndexOf(' ');
        int counter = 0;
        
        if (i < 0){
           for (int j = 0; j < s.length(); j++){
               counter++;
           }
        }
        else{
            if (i == s.length()-1){
                counter = lengthOfLastWord(s.substring(0,i));
            }
            for(int j = i+1; j < s.length(); j++){
                counter++;
            }
        }
        return counter;
    }
}