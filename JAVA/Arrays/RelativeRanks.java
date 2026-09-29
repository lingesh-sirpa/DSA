class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = i;
            arr[i][1] = score[i];
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        String[] ans = new String[n];
        int prize = 1;
        for(int i = 0; i < n; i++){
            if(prize == 1){
                ans[arr[i][0]] = "Gold Medal";
            }else if(prize == 2){
                ans[arr[i][0]] = "Silver Medal";
            }else if(prize == 3){
                ans[arr[i][0]] = "Bronze Medal";
            }else{
                ans[arr[i][0]] = String.valueOf(prize);
            }
            prize++;
        }

        return ans;
    }
}
