class Solution {

    int ans;
    public void findSingleElement(int[] nums, int i, int j){
        if(j < 0 || i > nums.length - 1 || i > j){
            return;
        }
        int mid = i + (j - i)/2;
        if(mid == 0 && nums[mid] < nums[mid + 1]){
           ans = mid;
        }else if(mid > 0 && mid < nums.length - 1 && nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]){
           ans = mid;
        }else if(mid == nums.length - 1 && nums[mid - 1] < nums[mid]){
           ans = mid;
        }
        findSingleElement(nums, i, mid - 1);
        findSingleElement(nums, mid + 1, j);
    }
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        ans = 0;
        findSingleElement(nums, 0, nums.length - 1);
        return nums[ans];
    }

}
