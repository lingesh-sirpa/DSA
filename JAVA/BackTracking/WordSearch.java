class Solution {

    static int[][] dir = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};

    public boolean wordSearch(char[][] board, String word, int idx, int r, int c, boolean[][] vis, int m, int n){
      if(idx == word.length()){
        return true;
      }
      if(r < 0 || r > (m - 1) || c < 0 || c > (n - 1) || vis[r][c] == true || board[r][c] != word.charAt(idx)){
         return false;
      }

      vis[r][c] = true;
      for(int i = 0; i < dir.length; i++){
        boolean flag = wordSearch(board, word, idx + 1, r + dir[i][0], c + dir[i][1], vis, m, n);
        if(flag == true){
            return true;
        }
      }
      vis[r][c] = false;

      return false;
    }

    public boolean exist(char[][] board, String word) {

            int m = board.length; int n = board[0].length;
            for(int i = 0; i < m; i++){
             for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(0)){
                   boolean flag = wordSearch(board, word, 0, i, j, new boolean[m][n], m, n);
                   if(flag == true){
                      return true;
                   }
                }
             }
            }
        
        return false;
    }
}
