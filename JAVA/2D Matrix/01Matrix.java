class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dir = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        int m = mat.length;
        int n = mat[0].length;
        LinkedList<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 0){
                    int[] arr = {i, j, 0};
                    q.addLast(arr);
                    vis[i][j] = true;
                }
                mat[i][j] = -1;
            }
        }

        while(q.size() > 0){
          int size = q.size();
           while(size-- > 0){
             int[] rem = q.removeFirst();
             int r = rem[0];
             int c = rem[1];
             int d = rem[2];
             mat[r][c] = d;
             for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr >= 0 && nc >= 0 && nr < m && nc < n && vis[nr][nc] == false){
                    int[] a = {nr, nc, d + 1};
                    q.addLast(a);
                    vis[nr][nc] = true;
                }
             }
           }
        }

        return mat;
    }
}
