class Solution {
    public int minOperations(int[][] grid, int x) {
        int m = grid.length;
        int n = grid[0].length;

        int base = grid[0][0];
        int[] arr = new int[m * n];
        int k = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(Math.abs(grid[i][j] - base) % x != 0){
                    return -1;
                }
                arr[k] = grid[i][j];
                k++;
            }
        }

        int ans = 0;
        Arrays.sort(arr);
        int med = arr[arr.length / 2];
        for(int i = 0; i < arr.length; i++){
           ans += Math.abs(med - arr[i])/x;
        }

        return ans;
    }
}
