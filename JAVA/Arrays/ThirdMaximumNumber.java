class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int count = 0;
        while(i > 0){
           if(nums[i] != nums[i - 1]){
            count++;
           }
           if(count == 2){
             return nums[i - 1];
           }
           i--;
        }

        return nums[nums.length - 1];
    }
}
