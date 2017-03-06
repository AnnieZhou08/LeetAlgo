public class Solution {
    public int findBlackPixel(char[][] picture, int N) {
        int[] row = new int[picture.length];
        int[] col = new int[picture[0].length];
       
        for(int i = 0; i < row.length; i++){
            for(int j = 0; j < col.length; j++){
                if(picture[i][j] == 'B'){
                    row[i]++;
                    col[j]++;
                }
            }
        }
       int count = 0;
       for(int i = 0; i < row.length; i++){
           for(int j = 0; j < col.length; j++){
               if(picture[i][j] == 'B' && row[i] == N && col[j] == N){
                   boolean isValid = true;
                   for(int k = 0; k < row.length; k++){
                       if(!isValid){
                           break;
                       }
                       if(picture[k][j] != 'B'){
                           continue;
                       }
                       if(k == i){
                           continue;
                       }
                       for(int l = 0; l < col.length; l++){
                           if(picture[k][l] != picture[i][l]){
                               isValid = false;
                               break;
                           }
                       }
                   }
                    if(isValid){
                        count++;
                    }
               }
               
           }
       }
       
        return count;
    }
}