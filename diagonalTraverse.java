public class Solution {
   
    public int[] findDiagonalOrder(int[][] matrix) {
        int rows = matrix.length;
        if(rows == 0){
            int[] result = new int[0];
            return result;
        }
        int cols = matrix[0].length;
        int[] res = new int[rows*cols];
        
        traverse(matrix, 0, 0, true, 0, res);
        
        return res;
        
    }
    public void traverse(int[][] matrix, int i, int j, boolean up, int count, int[] res){
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        if(count == rows*cols){
            return;
        }
        
        if(up && i == -1){
            
            if(j == cols){
                j = cols-1;
                i += 2;
                up = false;
                traverse(matrix, i, j, up, count, res);
            }else{
                up = false;
                i = 0;
                traverse(matrix, i, j, up, count, res);
            }
           
        }else if (up && j == cols){
            up = false;
            j = cols-1;
            i += 2;
            traverse(matrix, i, j, up, count, res);
        }else if (!up && i == rows){
            
            if(j == -1){
                j += 2;
                i = rows-1;
                up = true;
                traverse(matrix, i, j, up, count, res);
            }else{
                up = true;
                i = rows-1;
                j+=2;
                traverse(matrix, i, j, up, count, res);
            }
            
        }else if (!up && j == -1){
            up = true;
            j = 0;
            traverse(matrix, i, j, up, count, res);
        }else if (up){
            System.out.println(matrix[i][j]);
            res[count] = matrix[i][j];
            j++;
            i--;
            traverse(matrix, i, j, up, count+1, res);
        }else if (!up){
            System.out.println(matrix[i][j]);
            res[count] = matrix[i][j];
            j--;
            i++;
            traverse(matrix, i, j, up, count+1, res);
        }
    }
}