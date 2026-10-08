class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int start = 0;
        int op = 0; int cp = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                op++;
            }else{
                cp++;
            }
            if(op == cp){
                ans.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }

        return ans.toString();
    }
}
