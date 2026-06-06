class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] psum = new int[n];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            psum[i] = sum + nums[i];
            sum = sum + nums[i];
        }

        int[] ans = new int[n];
        int rsum = 0;
        for(int j = psum.length - 1; j >= 0; j--){
            ans[j] = Math.abs(psum[j] - nums[j] - rsum);
            rsum += nums[j];
        }

        return ans;
    }
}
