public class Solution {
    public int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        
        int times_2 = 0;
        int times_3 = 0;
        int times_5 = 0;
        
        for(int i = 1; i < n; i++){
            int two = 2*res[times_2];
            int three = 3*res[times_3];
            int five = 5*res[times_5];
            
            if(two == Math.min(Math.min(two, three), five)){
                times_2++;
                res[i] = two; 
            }
            if (three == Math.min(Math.min(two, three), five)){
                times_3++;
                res[i] = three;
            }
            if (five == Math.min(Math.min(two, three), five)){
                times_5++;
                res[i] = five;
            }
        }
        return res[n-1];
    }
}