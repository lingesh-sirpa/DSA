class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length - 1;
        int carry = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int j = k; j >= 0; j--){
           int add = 0;
            if(j == k){
             add = digits[j] + 1;
            }else{
             add = digits[j] + carry;
            }
            carry = add / 10;
            int rem = add % 10;
            st.push(rem);
        }

        if(carry == 1){
            st.push(1);
        }


        int[] ans = new int[st.size()];
        int i = 0;
        while(st.size() > 0){
            ans[i++] = st.pop();
        }


        return ans;
    }
}
