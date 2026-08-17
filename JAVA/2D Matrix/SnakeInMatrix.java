class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] mat = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mat[i][j] = (i * n) + j;
            }
        }

        int row = 0; int col = 0;
        for(int i = 0; i < commands.size(); i++){
            if(commands.get(i).equals("UP")){
                row--;
            }else if(commands.get(i).equals("DOWN")){
                row++;
            }else if(commands.get(i).equals("LEFT")){
                col--;
            }else{
                col++;
            }
        }

        return mat[row][col];
    }
}
