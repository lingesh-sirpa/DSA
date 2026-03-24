class Solution {
    public int orangesRotting(int[][] grid) {

     int m = grid.length;
     int n = grid[0].length;

     int[][] dir = {{-1,0}, {0,1}, {1,0}, {0,-1}};

     LinkedList<int[]> q = new LinkedList<>();
     int freshOranges = 0;
     for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
           if(grid[i][j] == 2){
            int[] arr = {i, j};
            q.addLast(arr);
           }

           if(grid[i][j] == 1){
            freshOranges++;
           }
        }
     } 

     if(freshOranges == 0){
        return 0;
     }

     int time = -1;
     while(q.size() != 0){
        int size = q.size();

        while(size != 0){
          int[] oranges = q.removeFirst();
          int r = oranges[0];
          int c = oranges[1];
          for(int i = 0; i < dir.length; i++){
            int nr = r + dir[i][0];
            int nc = c + dir[i][1];
            if(nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1){
                int[] arr = {nr, nc};
                q.addLast(arr);
                grid[nr][nc] = 2;
                freshOranges--;
            }
          }

          size--;
        }
        
        time++;
     }

     if(freshOranges != 0){
        return -1;
     }

     return time;
    }
}
