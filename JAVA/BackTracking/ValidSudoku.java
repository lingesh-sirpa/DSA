class Solution {

    public boolean checkValidSudoku(char[][] board, int row, int col){
        if(row == 9){
            return true;
        }

      if(board[row][col] != '.'){
        for(int i = 0; i < board.length; i++){
            if(i != row && board[row][col] == board[i][col]){
                return false;
            }
        }

        for(int i = 0; i < board[0].length; i++){
            if(i != col && board[row][col] == board[row][i]){
                return false;
            }
        }
        
        int stRow = (row / 3) * 3;
        int stCol = (col / 3) * 3;
        for(int i = stRow; i < stRow + 3; i++){
            for(int j = stCol; j < stCol + 3; j++){
                if(i != row && j != col && board[row][col] == board[i][j]){
                    return false;
                }
            }
        }
     }
        if(col == 8){
           return checkValidSudoku(board, row + 1, 0);
        }else{
           return checkValidSudoku(board, row, col + 1);
        }

    }

    public boolean isValidSudoku(char[][] board) {
        return checkValidSudoku(board, 0, 0);
    }

}
