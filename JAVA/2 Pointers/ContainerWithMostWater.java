class Solution {
    public int maxArea(int[] height) {
        int i = 0; 
        int j = height.length - 1;
        int ans = 0;
        while(i < j){
            int dist = j - i;
            if(height[i] < height[j]){
              ans = Math.max(ans, height[i] * dist);
              i++;
            }else{
              ans = Math.max(ans, height[j] * dist);
              j--;
            }
        }

        return ans;
    }
}
