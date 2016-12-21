public class Solution {
    public int countSegments(String s) {
        int counter = 0;
        boolean counted = false;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (counted == false && c != ' '){
                counted = true;
                counter++;
            } else if (c == ' '){
                counted = false;
            }
        }
        return counter;
    }
}