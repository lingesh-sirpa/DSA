class Solution {
    public boolean isValid(String s) {
     Stack<Character> st = new Stack<>();
     for(int i = 0; i < s.length(); i++){
      char chi = s.charAt(i);
      if(chi == '(' || chi == '{' || chi == '['){
         st.push(chi);
      }
      else{
         if(st.size() == 0){
            return false;
         }
         if(chi == ')' && st.peek() == '('){
            st.pop();
         }
         else if(chi == '}' && st.peek() == '{'){
            st.pop();
         }
         else if(chi == ']' && st.peek() == '['){
            st.pop();
         }
         else{
            return false;
         }
      }
     }

     if(st.size() != 0){
        return false;
     }
     return true;
    }
}
