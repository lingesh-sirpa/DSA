class Solution {
    public int missingNumber(int[] nums) {
     if(nums.length == 1 && nums[0] == 1){
        return 0;
     }
     if(nums.length == 1 && nums[0] == 0){
        return 1;
     } 
     HashMap<Integer, Integer> li = new HashMap<>();
     int l = Integer.MIN_VALUE;
     for(int i=0; i<nums.length; i++){
        l = Math.max(l, nums[i]);
        if(li.containsKey(nums[i])){
            li.put(nums[i], li.get(nums[i]) + 1);
        }
        else{
            li.put(nums[i], 1);
        }
     }
     for(int j=0; j<=l; j++){
        if(!li.containsKey(j)){
          return j;
        }
     }
     return l+1;
    }
}
