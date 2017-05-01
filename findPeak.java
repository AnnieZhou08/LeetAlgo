class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        if(A == null || A.length == 0) return -1;
        int start = 0;
        int end = A.length-1;
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(A[mid-1] < A[mid] && A[mid+1] < A[mid]){
                //peak is found
                return mid;
            }else if(A[mid] < A[mid-1] && A[mid] < A[mid+1]){
                //A trough (doesn't matter, we can go both ways)
                start = mid;
            }else if(A[mid-1] < A[mid] && A[mid] < A[mid+1]){
                //mid landed on the left
                start = mid;
            }else if(A[mid-1] > A[mid] && A[mid] > A[mid+1]){
                //mid landed on the right
                end = mid;
            }
        }
        return A[start] > A[end] ? start : end;
    }
}
