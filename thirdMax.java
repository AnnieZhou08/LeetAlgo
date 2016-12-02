public class Solution {
    public int thirdMax(int[] nums) {
        long small, mid, large;
        small = mid = large = Long.MIN_VALUE;
        int count = 0; // used to keep track if 3 or more max value is found;
        
        for (int n : nums){
            if (n == mid || n == large){
                continue;
            } else if (n > large){
                small = mid;
                mid = large;
                large = n;
                count ++;
            } else if (n > mid){
                small = mid;
                mid = n;
                count ++;
            } else if (n >= small){
                small = n;
                count ++;
            }
        }
        return small == Long.MIN_VALUE ? (int)large : (int)small;
    }
}