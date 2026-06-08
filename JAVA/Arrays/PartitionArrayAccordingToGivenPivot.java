class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> lp = new ArrayList<>();
        List<Integer> rp = new ArrayList<>();
        int countPivotElements = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                lp.add(nums[i]);
            }
            if(nums[i] > pivot){
                rp.add(nums[i]);
            }
            if(nums[i] == pivot){
                countPivotElements++;
            }
        }

        int[] ans = new int[nums.length];
        int k = 0;
        for(int j = 0; j < lp.size(); j++){
            ans[k] = lp.get(j);
            k++;
        }
        while(countPivotElements-- > 0){
            ans[k] = pivot;
            k++;
        }
        for(int j = 0; j < rp.size(); j++){
            ans[k] = rp.get(j);
            k++;
        }

        return ans;
    }
}
