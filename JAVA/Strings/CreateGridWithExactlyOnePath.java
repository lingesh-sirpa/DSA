class Solution {
    public String[] createGrid(int m, int n) {
        char[][] arr = new char[m][n];
        for(int i = 0; i < n; i++){
            arr[0][i] = '.';
        }
        for(int i = 1; i < m; i++){
            arr[i][n - 1] = '.';
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(arr[i][j] != '.'){
                    arr[i][j] = '#';
                }
            }
        }

        String[] ans = new String[m];
        for(int i = 0; i < m; i++){
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < n; j++){
                s.append(arr[i][j]);
            }
            ans[i] = s.toString();
        }

        return ans;
    }
}
