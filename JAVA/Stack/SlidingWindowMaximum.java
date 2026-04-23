class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i = n - 1; i >= 0; i--){
            while(st.size() > 0 && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            if(st.size() == 0){
                nge[i] = n;
            }else{
                nge[i] = st.peek();
            }
            st.push(i);
        }

        int tw = n - k;
        int[] ans = new int[tw + 1];
        for(int i = 0; i <= tw; i++){
            int j = i;
            while(nge[j] < i + k){
                j = nge[j];
            }
            ans[i] = nums[j];
        }

        return ans;
    }
}
