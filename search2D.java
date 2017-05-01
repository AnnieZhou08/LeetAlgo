public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0) return false;
        if(matrix[0] == null || matrix[0].length == 0) return false;
        
        int start_row = 0;
        int end_row = matrix.length-1;
        
        int row = -1;
        
        while(start_row + 1 < end_row){
            int mid = start_row + (end_row - start_row)/2;
            int len = matrix[mid].length-1;
            
            if(target >= matrix[mid][0] && target <= matrix[mid][len]){
                row = mid;
                break;
            }else if (target < matrix[mid][0]){
                end_row = mid;
            }else if (target > matrix[mid][len]){
                start_row = mid;
            }
        }
        
        if(target >= matrix[start_row][0] &&
           target <= matrix[start_row][matrix[start_row].length-1]){
            row = start_row;
        }
        
        if(target >= matrix[end_row][0] &&
           target <= matrix[end_row][matrix[end_row].length-1]){
            row = end_row;               
        }
        
        if(row == -1) return false;
        
        int start = 0;
        int end = matrix[row].length-1;
        
        while(start + 1 < end){
            int mid = start + (end - start)/2;
            
            if(target == matrix[row][mid]){
                return true;
            }else if (target < matrix[row][mid]){
                end = mid;
            }else if (target > matrix[row][mid]){
                start = mid;
            }
        }
        if(matrix[row][end] == target || matrix[row][start] == target) return true;
        
        return false;
    }
}

