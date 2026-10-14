class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int val = 1;
        int i = 0;
        while(i < nums.length - 1){
            if(nums[i] != val){
                return false;
            }
            val++; i++;
        }
        --val;
        if(nums[i] != val){
            return false;
        }
        
        return true;
    }
}
