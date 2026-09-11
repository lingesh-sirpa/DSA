class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int val = 1;
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            while(count > 0 && nums[i] > val){
                ans.add(val++);
                count--;
            }
            val++;
        }
        while(count > 0){
            ans.add(val++);
            count--;
        }
        return ans;
    }
}
