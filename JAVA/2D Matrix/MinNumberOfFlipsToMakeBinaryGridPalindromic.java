class Solution {
    public int minFlips(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int rowsflip = 0;
        for(int i = 0; i < m; i++){
            int k = 0; int l = n - 1;
            while(k < l){
                if(grid[i][k] != grid[i][l]){
                    rowsflip++;
                }
                k++; l--;
            }
        }
        int colsflip = 0;
        for(int i = 0; i < n; i++){
            int k = 0; int l = m - 1;
            while(k < l){
                if(grid[k][i] != grid[l][i]){
                    colsflip++;
                }
                k++; l--;
            }
        }
        
        return Math.min(rowsflip, colsflip);

    }
}
