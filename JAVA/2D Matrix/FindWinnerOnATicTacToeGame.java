class Solution {
    public String findWinner(char[][] board, int[][] moves){
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == 'X'){
                return "A";
            }else if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] == 'O'){
                return "B";
            }
        }

        for(int j = 0; j < 3; j++){
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] == 'X'){
                return "A";
            }else if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] == 'O'){
                return "B";
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'X'){
            return "A";
        }else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] == 'O'){
            return "B";
        }
        
        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] == 'X'){
            return "A";
        }else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[1][1] == 'O'){
            return "B";
        }

        if(moves.length == 9){
            return "Draw";
        }

        return "Pending";

    }
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for(int i = 0; i < moves.length; i++){
            if(i % 2 == 0){
              board[moves[i][0]][moves[i][1]] = 'X';
            }else{
              board[moves[i][0]][moves[i][1]] = 'O';
            }
        }

        return findWinner(board, moves);
    }
}
