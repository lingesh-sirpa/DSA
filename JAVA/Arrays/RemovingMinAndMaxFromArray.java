class Solution {
    public int minimumDeletions(int[] nums) {
        
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        int minidx = -1; int maxidx = -1;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] < minval){
                minval = nums[i];
                minidx = i;
            }
            if(nums[i] > maxval){
                maxval = nums[i];
                maxidx = i;
            }
        }
        
        int fr = Math.max(minidx, maxidx) - (-1);
        int br = n - Math.min(minidx, maxidx);
        int fandbr = Math.min(minidx, maxidx) - (-1) + n - Math.max(minidx, maxidx);

        return Math.min(fandbr, Math.min(fr, br));
    }
}
