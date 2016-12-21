public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int i = 0; //houses
        
        int radius = 0;
        
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
       for (int house : houses){
           while (i < heaters.length - 1 && heaters[i] + heaters[i+1] <= house*2){
               i++;
           }
           radius = Math.max (radius, Math.abs(heaters[i] - house));
       }
        return radius;
        
    }
}