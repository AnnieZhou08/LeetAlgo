public class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length >= 2){
            String prefx = CommonPrefix (strs[0], strs[1]);
            
            for (int j = 0; j < strs.length-1; j++){
               prefx = CommonPrefix (prefx, strs[j+1]);
            }
            return prefx;
        }
        else if (strs.length == 1){
            return strs[0];
        }
        else{
            return "";
        }
       
    }
    
    private String CommonPrefix(String str1, String str2){
        int index = Math.min(str1.length(), str2.length());
        String prefix = "";
        for (int i =0; i < index+1; i++){
            if(str1.substring(0, i).equals(str2.substring(0, i))){
                prefix = str1.substring(0, i);
            }
            else {
                return prefix;
            }
        }
        return prefix;
    }
}