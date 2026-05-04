class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length;
        LinkedList<Integer> q = new LinkedList<>();
        for(int j = 0; j < n; j++){
          for(int i = m-1; i >= 0; i--){
            q.addLast(matrix[i][j]);
          }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = q.removeFirst();
            }
        }
    }
}
