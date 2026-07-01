class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 1; i++){
           int diff = Math.abs(nums[i + 1] - nums[i]);
           ans = Math.min(diff, ans);
        }

        return ans;
    }
}
