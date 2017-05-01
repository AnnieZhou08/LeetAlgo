public class Solution {
    /**
     * @param A an integer array sorted in ascending order
     * @param target an integer
     * @return an integer
     */
    public int closestNumber(int[] A, int target) {
        // Write your code here
       int start = 0;
       int end = A.length-1;
       
       while(start + 1 < end){
           int mid = start + (end - start)/2;
           if(A[mid] == target){
               return mid;
           }else if (A[mid] < target){
               start = mid;
           }else if (A[mid] > target){
               end = mid;
           }
       }
       
       if(target - A[start] < A[end] - target){
           return start;
       }
       return end;
    }
}