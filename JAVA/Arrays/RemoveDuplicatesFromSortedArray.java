class Solution {
    public int removeDuplicates(int[] nums) {
       LinkedList<Integer> q = new LinkedList<>();
       HashSet<Integer> map = new HashSet<>();
       for(int i = 0; i < nums.length; i++){
         if(!map.contains(nums[i])){
          map.add(nums[i]);
          q.addLast(nums[i]);
         }
       } 

       int idx = 0;
       while(q.size() > 0){
         nums[idx] = q.removeFirst();
         idx++;
       }

       return map.size();
    }
}
