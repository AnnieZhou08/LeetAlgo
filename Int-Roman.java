public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap <Character, Integer>();
        map.put('I', 1); map.put('V', 5); map.put('X', 10); map.put('L', 50);
        map.put('C', 100); map.put('D', 500); map.put('M', 1000);
        
        int sum = 0;
        char[] numeral = s.toCharArray();
        
        for (int i = 0; i < numeral.length-1; i++){
            if (map.get(numeral[i]) < map.get(numeral[i+1])){
                sum = sum - map.get(numeral[i]);
            }
            else {
                sum = sum + map.get(numeral[i]);
            }
        }
        
        sum = sum + map.get(numeral[numeral.length-1]);
        return sum;
    }
}