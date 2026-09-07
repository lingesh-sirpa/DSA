class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int val = 1;
        int minR = 0; int maxR = n - 1;
        int minC = 0; int maxC = n - 1;
        while(minR <= maxR && minC <= maxC){
            if(minR <= maxR && minC <= maxC){
                for(int i = minC; i <= maxC; i++){
                    ans[minR][i] = val;
                    val++;
                }
            }
            minR++;
            
            if(minR <= maxR && minC <= maxC){
                for(int i = minR; i <= maxR; i++){
                    ans[i][maxC] = val;
                    val++;
                }
            }
            maxC--;

            if(minR <= maxR && minC <= maxC){
                for(int i = maxC; i >= minC; i--){
                    ans[maxR][i] = val;
                    val++;
                }
            }
            maxR--;

            if(minR <= maxR && minC <= maxC){
                for(int i = maxR; i >= minR; i--){
                    ans[i][minC] = val;
                    val++;
                }
            }
            minC++;
        }

        return ans;
    }
}
