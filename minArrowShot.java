public class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
    		public int compare(int[] a, int[] b) {
    			if(a[0]==b[0]) return a[1]-b[1];
    			else return a[0]-b[0];
    		}
    	});
    	int count = 0;
    	int max = Integer.MIN_VALUE;
    	for(int i = 0; i < points.length; i++){
    	   if(points[i][0] > max){
    	       max = points[i][1];
    	       count++;
    	   }else{
    	       max = Math.min(max, points[i][1]);
    	   }
    	}
        System.out.println(points);
        if(points.length == 1 && count == 0) return 1;
        return count;
    }
}