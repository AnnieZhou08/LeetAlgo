public class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int i = 0;
        int j = str.length()-1;
        boolean result = true;
        if (str.length() == 1){
            return result;
        }
        while (i<=j){
            if ((Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) &&
                (Character.isDigit(str.charAt(j)) || Character.isLetter (str.charAt(j)))){
                if (str.charAt(i) == str.charAt(j)){
                    i++;
                    j--;
                }
                else{
                    result = false;
                    return result;
                }
            }
            else if((Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i))) &&
               (!(Character.isDigit(str.charAt(j)) || Character.isLetter(str.charAt(j))))){
                   j--;
            }
            else if(!((Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)))) &&
                     (Character.isDigit(str.charAt(j)) || Character.isLetter(str.charAt(j)))){
                       i++;
            }
            else{
                j--;
                i++;
            }
        }
        return result;
    }
}