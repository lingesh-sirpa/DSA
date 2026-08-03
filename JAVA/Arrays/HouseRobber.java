class Solution {

    int[] maxAmount;
    public int calMaxAmount(int[] nums, int idx){
        if(idx >= nums.length){
            return 0;
        }
        if(maxAmount[idx] != -1){
            return maxAmount[idx];
        }
        int maxRobbedMoney = 0;
        for(int i = idx + 2; i < nums.length; i++){
            maxRobbedMoney = Math.max(maxRobbedMoney, nums[i] + calMaxAmount(nums, i));
        }
        return maxAmount[idx] = maxRobbedMoney;
    }

    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        maxAmount = new int[nums.length];
        Arrays.fill(maxAmount, -1);
        return Math.max(nums[0] + calMaxAmount(nums, 0), nums[1] + calMaxAmount(nums, 1));
    }
}
