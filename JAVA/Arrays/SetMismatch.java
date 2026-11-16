class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Arrays.sort(nums);
        int mis = -1; int rep = -1;
        int i = 0;
        while(i < nums.length - 1){
           if(nums[i] == nums[i + 1]){
              rep = nums[i];
              i = i + 2;
              while(i < nums.length){
                 nums[i - 1] = nums[i];
                 i++; 
              }
              break;
           }
           i++;
        }
        int val = 1; i = 0;
        while(i < nums.length - 1){
            if(nums[i] != val){
                mis = val;
                break;
            }
            val++;
            i++;
        }

        if(mis == -1){
            mis = nums.length;
        }
        int[] ans = {rep, mis};
        return ans;
    }
}
