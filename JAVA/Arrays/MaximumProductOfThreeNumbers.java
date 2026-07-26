class Solution {
    public int maximumProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int tmax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max){
                tmax = smax;
                smax = max;
                max = nums[i];
            }else if(nums[i] >= smax){
                tmax = smax;
                smax = nums[i];
            }else if(nums[i] >= tmax){
                tmax = nums[i];
            }

            if(nums[i] <= min){
                smin = min;
                min = nums[i];
            }else if(nums[i] <= smin){
                smin = nums[i];
            }
        }

        return Math.max(max * smax * tmax, min * max * smin);
    }
}
