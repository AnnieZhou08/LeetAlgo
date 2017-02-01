public class Solution {
    String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {

        List<String> res = new ArrayList<String>();
        if(digits.length() == 0){
            return res;
        }
        
        oneCombo("", res, 0, digits);
        
        return res;
        
    }
    
    public void oneCombo(String curr, List<String> res, int offset, String digits){
        if(offset >= digits.length()){
            res.add(curr);
            return;
        }
        String letters = arr[(digits.charAt(offset) - '0')];
        
        for(int i = 0; i < letters.length(); i++){
            curr = curr + letters.charAt(i);
            oneCombo(curr, res, offset+1, digits);
            curr = curr.substring(0, curr.length()-1);
        }
    }
}