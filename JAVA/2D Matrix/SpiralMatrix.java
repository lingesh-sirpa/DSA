class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int te = matrix.length * matrix[0].length;
        int minRow = 0; int minCol = 0;
        int maxRow = matrix.length - 1; int maxCol = matrix[0].length - 1;

        while(te > 0){
          for(int i = minCol; i <= maxCol; i++){
             if(te > 0){
              ans.add(matrix[minRow][i]);
             }
              te--;
          }
          minRow++;
          for(int i = minRow; i <= maxRow; i++){
            if(te > 0){
              ans.add(matrix[i][maxCol]);
            }
            te--;
          }
          maxCol--;
          for(int i = maxCol; i >= minCol; i--){
            if(te > 0){
            ans.add(matrix[maxRow][i]);
            }
            te--;
          }
          maxRow--;
          for(int i = maxRow; i >= minRow; i--){
            if(te > 0){
            ans.add(matrix[i][minCol]);
            }
            te--;
          }
          minCol++;
        }

      return ans;
    }
}
