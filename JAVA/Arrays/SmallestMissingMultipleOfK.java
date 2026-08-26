class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int j = k;
        int i = 0;
        while(i < nums.length){
            if(nums[i] < k){
               i++;
            }else if(nums[i] == k){
               k = k + j;
               i++;
            }else{
                return k;
            }
        }

        return k;
    }
}
