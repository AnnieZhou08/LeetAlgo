public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < s.length && j < s.length){
            if (s[j] < g[i]){
                j++;
            } else {
                count++;
                j++;
                i++;
            }
            if (i == g.length-1){
                i = 0;
            }
            if (count == g.length){
                return count;
            }
        }
        return count;
    }
}