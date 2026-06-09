class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long ans = 0;
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
           max = Math.max(nums[i], max);
           min = Math.min(nums[i], min);
        }
        long sub = max - min;
        return (sub * k);
    }
}
