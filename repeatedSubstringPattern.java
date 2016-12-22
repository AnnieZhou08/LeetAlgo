public class Solution {
    public boolean repeatedSubstringPattern(String str) {
        int l = str.length();
        for (int i = 1; i <= l/2; i++){
            if (l%i == 0){
                String sub = str.substring(0, i);
                int m = l/i;
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < m; j++){
                    sb.append(sub);
                }
                if (sb.toString().equals(str)) return true;
            }
        }
        return false;
    }
}