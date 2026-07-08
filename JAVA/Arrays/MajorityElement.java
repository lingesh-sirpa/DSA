class Solution {
    public int majorityElement(int[] nums) {
        int half = (int) nums.length/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int ans = -1;
        for(int i : map.keySet()){
            if(map.get(i) > half && map.get(i) > ans){
                ans = i;
            }
        }

        return ans;
    }
}
