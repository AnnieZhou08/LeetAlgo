public class Solution {
    public String getHint(String secret, String guess) {
        char sec[] = secret.toCharArray();
        char gue[] = guess.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        HashSet<Character> set = new HashSet<Character>();
        
        int bull = 0;
        int intersect = 0;
        
        for (int i = 0; i < Math.min(sec.length, gue.length); i++){
            if (sec[i] == gue[i]){
                bull++;
            }
        }
        for (int i = 0; i < sec.length; i++){
            if (map1.containsKey(sec[i])){
                map1.put(sec[i], map1.get(sec[i]+1));
            } else {
                map1.put(sec[i], 1);
            }
        }
        for (int i = 0; i < gue.length; i++){
            if (map2.containsKey(gue[i])){
                map2.put(gue[i], map2.get(gue[i]+1));
            } else {
                map2.put(gue[i], 1);
            }
        }
        for (char c : sec){
            set.add(c);
        }
        for (char c : set){
            intersect += Math.min(map1.get(c), map2.get(c));
        }
        int cow = intersect - bull;
        String result = bull + "A" + cow + "B";
        
        return result;
        
    }
}