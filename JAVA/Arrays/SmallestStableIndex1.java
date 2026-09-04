class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] minvals = new int[nums.length];
        int min = Integer.MAX_VALUE;
        for(int i = nums.length - 1; i >= 0; i--){
            minvals[i] = Math.min(nums[i], min);
            min = minvals[i];
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(nums[i], max);
            if(max - minvals[i] <= k){
                return i;
            }
        }

        return -1;
    }
}
