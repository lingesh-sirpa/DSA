class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid = nums.length / 2;
        int i = 0; int j = nums.length - 1;
        while(i < j){
            if(nums[i] == nums[mid] || nums[j] == nums[mid]){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
