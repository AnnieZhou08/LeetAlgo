public class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 0; i < s.length()-p.length()+1; i++){
            if (isAnagram(s.substring(i, i+p.length()), p)){
                result.add(i);
            }
        }
        return result;
    }
    
    private Boolean isAnagram(String s, String t){
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++){
            if (arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}