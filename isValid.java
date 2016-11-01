public class Solution {
    public boolean isValid(String s) {
        HashMap <Character, Character> map = new HashMap <Character, Character>();
        map.put('(', ')'); map.put('[', ']'); map.put('{', '}');
        
        boolean result = false;
        
        if (s.equals("()") || s.equals ("[]") || s.equals ("{}") || s.equals("")){
            result = true;
        }
        else if (s.length() == 1){
            result = false;
        }
        else{
            for (int i = 1; i <= s.length()-1; i++){
                if (map.get(s.charAt(0)) == null){
                    result = false;
                }
                else if (map.get(s.charAt(0)) == s.charAt(i)){
                    if (isValid (s.substring(1, i))){
                        result = isValid (s.substring(i+1));
                    }
                }
            }
        }
        return result;
        
    }
}