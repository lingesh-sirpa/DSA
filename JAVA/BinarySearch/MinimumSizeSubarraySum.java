class Solution {

    public boolean subArraySum(int[] nums, int[] psum, int tar, int mid){
       int k = mid - 1;
       int i = 0;
       int sum = 0;
       while(k < psum.length){
          if((psum[k] - sum) >= tar){
            return true;
          }
          sum += nums[i];
          k++; i++;
       }
       return false;
    }

    public int minSubArrayLen(int target, int[] nums) {
        int[] psum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            psum[i] = nums[i] + sum;
            sum += nums[i];
        }
        int l = 1;
        int h = nums.length;
        int ans = 0;
        while(l <= h){
            int mid = l + (h - l)/2;
            if(subArraySum(nums, psum, target, mid)){
               ans = mid;
               h = mid - 1;
            }else{
               l = mid + 1;
            }
        }
        return ans;
    }
}
