class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            int n = nums[i];
            
           if(map.containsKey(nums[i])){
              ans = Math.min(ans, i - map.get(nums[i]));
           }
           int rev = 0;
           while(n > 0){
              rev = rev*10 + (n%10);
              n = n/10;
           }
           map.put(rev, i);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
