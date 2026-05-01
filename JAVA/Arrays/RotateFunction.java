class Solution {
    public int maxRotateFunction(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int sum = 0;
        int F = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            F += i * nums[i];
        }

        int n = nums.length;
        int ans = F;
        for(int k = 1; k < n; k++){
           F = F + sum - n * nums[n - k];
           ans = Math.max(F, ans);
        }

        return ans;
    }
}
