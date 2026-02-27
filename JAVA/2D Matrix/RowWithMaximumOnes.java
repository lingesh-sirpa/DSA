class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
      int m = mat.length-1; int n = mat[0].length-1;
      int i=0; 
      int row = 0; int count = 0;
      while(i <= m){
        int j=0; int c = 0;
        while(j <= n){
          if(mat[i][j] == 0){
            j++;
          }
          else{
            c++;
            if(c > count){
                count = c;
                row = i;
            }
            j++;
          }
        }
        i++;
      }
      int[] ans = {row, count};
      return ans;
    }
}
