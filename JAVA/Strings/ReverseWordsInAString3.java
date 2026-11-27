class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder check = new StringBuilder();
        int i = 0; int j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(ch == ' '){
              check.reverse();
              ans.append(check);
              ans.append(' ');
              check = new StringBuilder();
              i = j + 1;
            }else{
              check.append(ch);
            }
            j++;
        }
        check.reverse();
        ans.append(check);
        
        return ans.toString();
    }
}
