public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        int start = 0;
        int end = A.length-1;
        
        if(A.length == 0 || A == null) return -1;
        
        int s = A[0];
        int e = A[end];
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            
            if(target == A[mid]){
                return mid;
            }
            
            if(A[mid] > s){
                if(target < A[mid] && target >= s){
                    end = mid;
                }else if(target > A[mid] || target < s){
                    start = mid; 
                }
            }else if (A[mid] < e){
                if(target <= e && target > A[mid]){
                    start = mid;
                }else if(target < A[mid] || target > e){
                    end = mid;
                }
            }
        }
        
        if(A[start] == target){
            return start;
        }
        if(A[end] == target){
            return end;
        }
        return -1;
    }
}

public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    //1. find pivot
    //binary search on the known section
    public int search(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0) return -1;
        int pivot = findMin(A);
        int last = A[A.length-1];
        int start = 0; int end = A.length-1;
        if(target <= last){
            start = pivot;
        }else{
            end = pivot-1;
        }
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(A[mid] == target){
                return mid;
            }else if(A[mid] < target){
                start = mid;
            }else if(A[mid] > target){
                end = mid;
            }
        }
        if(A[start] == target) return start;
        if(A[end] == target) return end;
        return -1;
        
    }
    
    public int findMin(int[] A){
        int start = 0;
        int end = A.length-1;
        int last = A[end];
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            if(A[mid] < A[mid-1] && A[mid] < A[mid+1]){
                return mid;
            }else if(A[mid] <= last){
                end = mid;
            }else{
                start = mid;
            }
        }
        
        return A[start] < A[end] ? start : end;
    }
}
