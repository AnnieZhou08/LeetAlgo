public class Solution {
    public int myAtoi(String str) {
        int isNeg = 1;
        StringBuilder sb = new StringBuilder();
        Boolean started = false;
        
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            
            if (c == ' ' && started == false) continue;
            else if (Character.isDigit(c)){
                sb.append(c);
                started = true;
            }
            else if (c == '+' && started == false){
                isNeg = 1;
                started = true;
            }
            else if (c == '-' && started == false){
                isNeg = -1;
                started = true;
            } else break;
        }
        System.out.println(sb.toString());
        if (sb.toString().equals("")) return 0;
        try{
            Integer.parseInt(sb.toString());
        } catch (NumberFormatException e){
            if (isNeg == 1) return Integer.MAX_VALUE;
            else if (isNeg == -1) return Integer.MIN_VALUE;
        }
        
        return Integer.parseInt(sb.toString())*isNeg;
        
    }
}