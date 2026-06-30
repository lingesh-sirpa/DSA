class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        for(int j = 0; j < moveFrom.length; j++){
            set.remove(moveFrom[j]);
            set.add(moveTo[j]);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i : set){
            ans.add(i);
        }

        return ans;
    }
}
