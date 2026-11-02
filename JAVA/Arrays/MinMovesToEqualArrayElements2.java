class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int val1 = nums[(0 + n)/2];
        int ans = 0;
        for(int i : nums){
            ans += Math.abs(val1 - i);
        }
        if(n % 2 != 0){
           val1 = val1 + 1;
           int ans2 = 0;
           for(int j : nums){
              ans2 += Math.abs(val1 - j);
           }
           ans = Math.min(ans, ans2);
        }


       return ans;
    }
}
