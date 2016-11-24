public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] note = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        
        Arrays.sort(note);
        Arrays.sort(mag);
        int i = 0;
        int j = 0;
        if (note.length == 0) return true;
        while (i < mag.length && j < mag.length){
            if (note[i] != mag[j]){
                j++;
            } else {
                i++;
                j++;
            }
            if (i == note.length){
                return true;
            }
        }
        return false;
    }
}