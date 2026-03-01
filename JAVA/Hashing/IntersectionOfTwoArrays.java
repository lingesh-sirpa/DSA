class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> li = new ArrayList<>();
        HashSet<Integer> map = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
           map.add(nums1[i]);
        }

        for(int j=0; j<nums2.length; j++){
            if(map.contains(nums2[j])){
                li.add(nums2[j]);
                map.remove(nums2[j]);
            }
        }
        int[] ans = new int[li.size()];
        for(int k=0; k<ans.length; k++){
            ans[k] = li.get(k);
        }
        return ans;
    }
}
