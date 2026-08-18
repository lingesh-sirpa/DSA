class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if(k == n){
            int ans = nums[0];
            for(int i : nums){
                ans = Math.max(ans, i);
            }
            return ans;
        }
        int[] freq = new int[51];
        for(int i : nums){
            freq[i]++;
        }
        if(k == 1){
           for(int i = 50; i >= 0; i--){
              if(freq[i] == 1){
                return i;
              }
           }
           return -1;
        }
        
        int ans = -1;
        if(freq[nums[0]] == 1){
            ans = Math.max(ans, nums[0]);
        }
        if(freq[nums[n - 1]] == 1){
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}
