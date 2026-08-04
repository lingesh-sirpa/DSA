class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            minEle = Math.min(minEle, i);
            maxEle = Math.max(maxEle, i);
            set.add(i);
        }
        for(int i = minEle; i <= maxEle; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }

        return ans;
    }
}
