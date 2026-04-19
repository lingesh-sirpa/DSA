class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
    
       int maxDist = 0;
       for(int k = 0; k < nums2.length; k++){
          int i = 0; int j = nums1.length - 1;
          while(i <= j){
             int mid = i + (j - i)/2;
             if(mid <= k && nums1[mid] <= nums2[k]){
                maxDist = Math.max(maxDist, k - mid);
                j = mid - 1;
             }else if(mid <= k && nums1[mid] > nums2[k]){
                i = mid + 1;
             }else{
                j = mid - 1;
             }
          }
       }

       return maxDist;
    }
}
