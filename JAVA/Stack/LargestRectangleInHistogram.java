class Solution {
    public int largestRectangleArea(int[] heights) {
     int[] lse = new int[heights.length];
     Stack<Integer> st = new Stack<>();
     for(int i=0; i<heights.length; i++){
        int val = heights[i];
        while(st.size() > 0 && heights[st.peek()] >= val){
            st.pop();
        }
        if(st.size() == 0){
            lse[i] = -1;
        }else{
            lse[i] = st.peek();
        }
        st.push(i);
     }

     int[] rse = new int[heights.length];
     st = new Stack<>();
     for(int i=heights.length-1; i>=0; i--){
        int val = heights[i];
        while(st.size() > 0 && heights[st.peek()] >= val){
            st.pop();
        }
        if(st.size() == 0){
            rse[i] = heights.length;
        }else{
            rse[i] = st.peek();
        }
        st.push(i);
     }
     
     int maxArea = -1;
     for(int j=0;j<heights.length;j++){
        int cuArea = heights[j]*(rse[j]-lse[j]-1);
        maxArea = Math.max(cuArea,maxArea);
     }
     return maxArea;
    }
}
