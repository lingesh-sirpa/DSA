class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int seqSum = nums[0];
        for(int i = 1; i < nums.length; i++){
           if(nums[i] != nums[i - 1] + 1){
               break;
           }
           seqSum += nums[i];
        }
        boolean flag = true;
        while(flag){
            if(!set.contains(seqSum)){
                flag = false;
            }
            seqSum++;
        }

        return --seqSum;
    }
}
