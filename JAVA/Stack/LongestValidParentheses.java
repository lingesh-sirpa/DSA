class Solution {
    public int longestValidParentheses(String s) {
        if(s.length() == 0){
            return 0;
        }
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int i=0; int maxlen = 0;
        while(i < s.length()){
         char ch = s.charAt(i);
         if(ch == '('){
            st.push(i);
         }
         else if(ch == ')'){
            st.pop();
         }
         if(st.size() == 0){
            st.push(i);
         }else{
            int len = i-st.peek();
            maxlen = Math.max(len, maxlen);
         }
         i++;
        }
        return maxlen;
    }
}
