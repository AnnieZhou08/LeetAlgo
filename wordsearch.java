public class Solution {
    //given a 2D array
    //determine if word exists in the grid
    //word exists if adjacent (vertically/horizontally) cells make up the sequential characters of the word
    //each cell can only be used once
    
    public boolean exist(char[][] board, String word) {
        boolean result = false;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                //if found an initial position, start searching for existance 
                if (word.charAt(0) == board[i][j]){
                    result = exist (board, word, i, j, 0);
                    if (result){
                        return result;
                    }
                }
            }
        }
        return result;
    }
    
    private boolean exist(char[][] board, String word, int i, int j, int k){
        if (k == word.length()){
            return true;
        } //meaning all letters have been found in the board
        
        if (j < 0 || i < 0 || i == board.length || j == board[i].length) {
            return false;
        } //meaning i and j has gone over board lengths
        
        if (board[i][j] != word.charAt(k)){
            return false;
        }
        
        board [i][j] = '#'; //marks position so cell will not be reused again
        boolean result = exist(board, word, i, j+1, k+1)
                    ||   exist(board, word, i, j-1, k+1)
                    ||   exist(board, word, i+1, j, k+1)
                    ||   exist(board, word, i-1, j, k+1);
                    
        board[i][j] = word.charAt(k); //places character back for future searches
        
        return result;
    }
}