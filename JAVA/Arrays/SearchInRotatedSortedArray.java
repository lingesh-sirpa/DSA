class Solution {
    public boolean search(int[] nums, int target) {
        int[] arr = new int[nums.length];
        int j = 1; int i = 0;
        while(i < nums.length && j < nums.length){
            if(nums[i] > nums[j]){
                break;
            }
            i++; j++;
        }
        int k = 0;
        while(j < nums.length){
            arr[k] = nums[j];
            k++; j++;
        }
        j = 0;
        while(j <= i){
          arr[k] = nums[j];
          k++; j++;
        }
        
        i = 0; j = arr.length - 1;
        while(i <= j){
          int mid = i + (j - i)/2;
          if(arr[mid] == target){
            return true;
          }else if(arr[mid] > target){
            j = mid - 1;
          }else{
            i = mid + 1;
          }
        }

        return false;

    }
}
