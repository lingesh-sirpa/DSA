class Solution {
    public String reverseParentheses(String s) {

        Stack<Character> st = new Stack<>();
        LinkedList<Character> q = new LinkedList<>();
        
        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '('){
               while(st.size() > 0 && st.peek() != ')'){
                  q.addLast(st.pop());
               }
               st.pop();
               while(q.size() > 0){
                  st.push(q.removeFirst());
               }
            }else{
                st.push(ch);
            }
        }

        String ans = "";
        while(st.size() > 0){
            ans += st.pop();
        }

        return ans;
    }
}
