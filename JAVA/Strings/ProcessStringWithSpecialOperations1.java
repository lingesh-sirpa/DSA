class Solution {
    public String processStr(String s) {
       StringBuilder ans = new StringBuilder();

       for(int i = 0; i < s.length(); i++){
         char ch = s.charAt(i);
         if(ch >= 'a' && ch <= 'z'){
            ans.append(ch);
         }else if(ch == '*'){
             if(ans.length() > 0){
                ans.deleteCharAt(ans.length() - 1);
             }
         }else if(ch == '%'){
             ans = ans.reverse();
         }else if(ch == '#'){
             if(ans.length() > 0){
                StringBuilder temp = ans;
                ans.append(temp);
             }
         }
       }
       
       return ans.toString();

    }
}
