public class Solution {
    public String convert(String s, int numRows) {
       int row = 0;
       HashMap <Integer, String> map = new HashMap <Integer, String> ();
       Boolean downwards = true;
       
       if (numRows == 1) return s;
       
       for (int i = 0; i < s.length(); i++){
           if (map.containsKey(row)){
               map.put(row, map.get(row) + Character.toString(s.charAt(i)));
           } else {
               map.put(row, Character.toString(s.charAt(i)));
           }
           if (row == numRows - 1 && downwards == true){
               row --;
               downwards = false;
           } else if (row == 0){
               row++;
               downwards = true;
           }  else if (downwards == false){
               row--;
           } else if (row < numRows - 1 && downwards == true){
               row++;
           }
       }
       String result = "";
       for (int i = 0; i < numRows; i++){
           result += map.getOrDefault(i, "");
       }
       System.out.println(map);
       return result;
        
        
    }
}