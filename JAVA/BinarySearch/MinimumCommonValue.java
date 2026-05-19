class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length; i++){
            int findMin = nums1[i];
            int k = 0; int l = nums2.length - 1;
            while(k <= l){
               int mid = k + (l - k)/2;
               if(nums2[mid] == findMin){
                  return findMin;
               }else if(nums2[mid] > findMin){
                    l = mid - 1;
               }else{
                    k = mid + 1;
               }
            }
        }

        return -1;
    }
}
