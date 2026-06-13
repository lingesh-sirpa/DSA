class Solution {
    public long findScore(int[] nums) {

        long score = 0;
        int[][] arr = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        boolean[] mark = new boolean[nums.length];
        int k = 0;
        while(k < arr.length){
            int val = arr[k][0];
            int idx = arr[k][1];

            if(!mark[idx]){
                score += val;
                mark[idx] = true;
                if((idx - 1) >= 0){
                    mark[idx - 1] = true;
                }
                if((idx + 1) < nums.length){
                    mark[idx + 1] = true;
                }
            }
            k++;
        }

        return score;
    }
}
