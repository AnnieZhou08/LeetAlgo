public class Solution {
    public int numberOfBoomerangs(int[][] points) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        int result = 0;
        for (int i = 0; i < points.length; i++){
            for (int j = 0; j < points.length; j++){
                if (i == j) continue;
                
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0)+1);
            }
            for (int val : map.values()){
                result += val*(val-1);
            }
            map.clear();
        }
        return result;
    }
    
    private int getDistance(int[] a, int[] b){
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        
        return dx*dx + dy*dy;
    }
}