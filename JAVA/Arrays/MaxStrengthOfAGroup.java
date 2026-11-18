class Solution {
    public long maxStrength(int[] nums) {
        int n = nums.length;
        if(n == 1){
          return nums[0];
        }
        Arrays.sort(nums);
        int mul = 1;
        long ans = 1;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                mul *= nums[i];
                if(mul > 0){
                  ans = ans * mul;
                  mul = 1;
                }
            }else if(nums[i] == 0){
                count++;
            }else{
                ans *= nums[i];
            }
        }
        
        if(count > 0 && nums[n - 1] == 0 && (n - count) < 2){
            return 0;
        }
        return ans;

    }
}
