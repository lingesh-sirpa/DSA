class Solution {

    public boolean isValid(int arrval, int r, int c, int rr, int rc){
        if(arrval == 1){
            int[][] dir = {{0, -1}, {0, 1}};
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr == rr && nc == rc){
                    return true;
                } 
            }
        }else if(arrval == 2){
            int[][] dir = {{-1, 0}, {1, 0}};
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr == rr && nc == rc){
                    return true;
                } 
            }
        }else if(arrval == 3){
            int[][] dir = {{0, -1}, {1, 0}};
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr == rr && nc == rc){
                    return true;
                } 
            }
        }else if(arrval == 4){
            int[][] dir = {{0, 1}, {1, 0}};
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr == rr && nc == rc){
                    return true;
                } 
            }
        }else if(arrval == 5){
            int[][] dir = {{-1, 0}, {0, -1}};
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr == rr && nc == rc){
                    return true;
                } 
            }
        }else if(arrval == 6){
            int[][] dir = {{-1, 0}, {0, 1}};
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr == rr && nc == rc){
                    return true;
                } 
            }
        }

        return false;
    }
    public boolean hasValidPath(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
       
        int[][] dir = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
        LinkedList<int[]> q = new LinkedList<>();
        int[] arr = {0, 0, grid[0][0]};
        q.addLast(arr);
        boolean[][] vis = new boolean[m][n];
        vis[0][0] = true;

        while(q.size() > 0){

            int[] rem = q.removeFirst();
            int r = rem[0];
            int c = rem[1];
            if(r == m - 1 && c == n - 1){
                return true;
            }
            for(int i = 0; i < dir.length; i++){
                int nr = r + dir[i][0];
                int nc = c + dir[i][1];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && vis[nr][nc] == false){
                   if(isValid(grid[nr][nc], nr, nc, r, c) && isValid(grid[r][c], r, c, nr, nc)){
                        int[] a = {nr, nc, grid[nr][nc]};
                        vis[nr][nc] = true;
                        q.addLast(a);
                   }
                }
            }
          }
        return false;
    }
}
