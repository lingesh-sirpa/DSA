class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length; int n = grid[0].length;
        int[][] newGrid = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int oldIndex = (i * n) + j;   //if 2D grid converted into 1D array, then index of array = oldIndex.
                int newIndex = (oldIndex + k) % (m * n);
                int newRow = newIndex / n; 
                int newCol = newIndex % n;
                newGrid[newRow][newCol] = grid[i][j];
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < m; i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++){
                list.add(newGrid[i][j]);
            }
            ans.add(list);
        }

        return ans;
    }
}
