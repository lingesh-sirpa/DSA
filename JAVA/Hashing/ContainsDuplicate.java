class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashMap<Integer, Integer> li = new HashMap<>();
      int i=0; boolean flag = false;
      while(i < nums.length){
        if(li.containsKey(nums[i])){
          flag = true;
        }
        li.put(nums[i], 1);
        i++;
      }
      return flag;
    }
}
