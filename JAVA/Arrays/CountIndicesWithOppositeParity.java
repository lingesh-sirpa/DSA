class Solution {
    public int[] countOppositeParity(int[] nums) {
        
        int evenNumCount = 0;
        int oddNumCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evenNumCount++;
            }else{
                oddNumCount++;
            }
        }
        
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                ans[i] = oddNumCount;
                evenNumCount--;
            }else{
                ans[i] = evenNumCount;
                oddNumCount--;
            }
        }
        return ans;
    }
}
