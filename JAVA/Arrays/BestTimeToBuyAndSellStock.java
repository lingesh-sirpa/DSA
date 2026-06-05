class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[prices.length];
        for(int i = prices.length - 1; i >= 0; i--){
            if(st.size() == 0){
                nge[i] = -1;
            }else{
                nge[i] = prices[st.peek()];
            }
        
             if(st.size() == 0){
                st.push(i);
             }else if(st.size() > 0 && prices[i] >= prices[st.peek()]){
                st.push(i);
             }
        }
        
        int ans = 0;
        for(int i = 0; i < prices.length; i++){
            if(nge[i] != -1){
              ans = Math.max(ans, nge[i] - prices[i]);
            }
        }

        return ans;
    }
}
