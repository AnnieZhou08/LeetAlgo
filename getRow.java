public class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = 0;
        long kCn = 1;
        int k = rowIndex;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (n <= k){
            result.add((int)kCn);
            kCn = kCn * (k-n)/(n+1);
            n++;
        }
        return result;
    }
}