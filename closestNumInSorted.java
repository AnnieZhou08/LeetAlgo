public class Solution {
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int closestNumber(int[] A, int target) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        
        int res = -1;
        
        int low = 0;
        int high = A.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(A[mid] == target){
                return mid;
            }else if (A[mid] < target){
                if(Math.abs(A[mid] - target) < min){
                    res = mid;
                    min = Math.abs(A[mid] - target);
                }
                low = mid+1;
            }else if (A[mid] > target){
                if(Math.abs(A[mid]-target) < min){
                    res = mid;
                    min = Math.abs(A[mid] - target);
                }
                high = mid-1;
            }
        }
        return res;
    }
}