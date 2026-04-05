class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1){
            return -1;
        }
        int[][] dir = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        LinkedList<int[]> q = new LinkedList<>();
        int[] arr1 = {0, 0};
        q.addLast(arr1);
        int ans = 1;
        int m = grid.length - 1; int n = grid[0].length - 1;
        System.out.print(m + " " + n);
        boolean[][] flag = new boolean[m][n];
        flag[0][0] = true;
        while(q.size() > 0){
            int size = q.size();
             while(size > 0){
               int[] rem = q.removeFirst();
               if(rem[0] == m && rem[1] == n){
                 return ans;
               }
               for(int i = 0; i < dir.length; i++){
                int nr = rem[0] + dir[i][0];
                int nc = rem[1] + dir[i][1];
                if(nr >= 0 && nr <= m && nc >= 0 && nc <= n && grid[nr][nc] == 0 && flag[nr][nc] == false){
                    int[] arr2 = {nr, nc};
                    q.addLast(arr2);
                    flag[nr][nc] = true;
                }
               }
               size--;
             }
            ans++;
        }

        return -1;
    }
}
