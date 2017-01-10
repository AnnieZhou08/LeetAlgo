public class Solution {
    public int countBattleships(char[][] board) {
        //for every block we parse, we check for the right block and the bottom block
        //if both are empty, this means we have reached to the end of the battle ship
        
        int res = 0;
        
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[0].length; j++){
                //case 1 (at a corner)
                if (i == board.length-1 && j == board[0].length-1){ //at bottom left corner
                    if(board[i][j] == 'X') res++;
                }
                //case 2 (at an edge)
                else if (i == board.length-1){ //at last row (cannot check vertical)
                    if(board[i][j] == 'X'){
                        if (board[i][j+1] == '.'){
                            res++;
                        }else continue;
                    }else continue;
                }
                else if (j == board[0].length-1){ //at last col (cannot check horizontal)
                    if(board[i][j] == 'X'){
                        if(board[i+1][j] == '.'){
                            res++;
                        }else continue;
                    }else continue;
                }
                //case 3 (in the middle)
                else{// in the middle, can check both vertical and horizontal
                    if(board[i][j] == 'X'){
                        if(board[i+1][j] == '.' && board[i][j+1] == '.'){
                            res++;
                        }else continue;
                    }else continue;
                }
            }
        }
        return res;
    }
}