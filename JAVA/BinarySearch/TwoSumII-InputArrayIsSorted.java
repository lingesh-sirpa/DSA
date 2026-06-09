class Solution {
    public int checkComplement(int[] arr, int tar, int idx){
        int i = idx; int j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] == tar){
                return mid;
            }else if(arr[mid] < tar){
                i = mid + 1;
            }else{
                j = mid - 1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = {-1, -1};
        
        for(int i = 0; i < numbers.length; i++){
            ans[0] = i + 1;
            int tar = target - numbers[i];
            int secondIdx = checkComplement(numbers, tar, i + 1);
            if(secondIdx != -1){
                ans[1] = secondIdx + 1;
                return ans;
            }
        }
        if(ans[1] == -1){
            ans[0] = -1;
        }
        return ans;
    }
}
