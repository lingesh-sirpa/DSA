class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        Arrays.sort(nums);
        int ans = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i - 1] == 1){
               ans = Math.max(ans, map.get(nums[i]) + map.get(nums[i - 1]));
            }
        }

        return ans;
    }
}
