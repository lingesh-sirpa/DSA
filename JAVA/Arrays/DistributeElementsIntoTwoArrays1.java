class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i = 2; i < nums.length; i++){
            int idxl1 = l1.size() - 1;
            int idxl2 = l2.size() - 1;
            if(l1.get(idxl1) > l2.get(idxl2)){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }

        int k = 0;
        for(int i = 0; i < l1.size(); i++){
           nums[k] = l1.get(i);
           k++;
        }
        for(int i = 0; i < l2.size(); i++){
            nums[k] = l2.get(i);
            k++;
        }

       return nums;
    }
}
