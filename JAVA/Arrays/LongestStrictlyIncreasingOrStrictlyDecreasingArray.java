class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int st = 0; int i = 1;
        while(i < nums.length){
            if(nums[i] > nums[i - 1]){
                ans = Math.max(ans, i - st + 1);
            }else{
                st = i;
            }
            i++;
        }
        st = 0; i = 1;
        while(i < nums.length){
            if(nums[i] < nums[i - 1]){
                ans = Math.max(ans, i - st + 1);
            }else{
                st = i;
            }
            i++;
        }

        return ans;
    }
}
