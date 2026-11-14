class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int len = 0;
        for(int i = 0; i < nums.size(); i++){
           int sum = 0;
           for(int j = i; j < nums.size(); j++){
              sum += nums.get(j);
              len = j - i + 1;
              if(len > r){
                break;
              }
              if(sum > 0 && sum < ans && len >= l && len <= r){
                 ans = sum;
              }
           }
        }
        
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}
