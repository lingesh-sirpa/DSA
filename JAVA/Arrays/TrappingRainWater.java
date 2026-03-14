class Solution {
    public int trap(int[] height) {
      int max = -1;
      int[] lle = new int[height.length];
      for(int i=0; i<height.length; i++){
         max = Math.max(max, height[i]);
         lle[i] = max;
      }
      
      int[] rle = new int[height.length];
      max = -1;
      for(int i=height.length-1; i>=0; i--){
        max = Math.max(max, height[i]);
        rle[i] = max;
      }

      int ans = 0;
      for(int k=0; k<height.length; k++){
        int trap = Math.min(lle[k], rle[k]) - height[k];
        ans += trap;
      }
      
      return ans;
    }
}
