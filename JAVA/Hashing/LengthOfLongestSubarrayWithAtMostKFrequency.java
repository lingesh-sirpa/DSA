class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        int longestlen = 0;
        int i = 0; int j = 0;
        while(j < nums.length){
           freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
           if(freq.get(nums[j]) <= k){
              longestlen = Math.max(longestlen, j - i + 1);
           }else{
              while(freq.get(nums[j]) > k){
                 freq.put(nums[i], freq.getOrDefault(nums[i], 0) - 1);
                 i++;
              }
              longestlen = Math.max(longestlen, j - i + 1);
           }
           j++;
        }
        
        return longestlen;
    }
}
