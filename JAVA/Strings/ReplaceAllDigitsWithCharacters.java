class Solution {
    public String replaceDigits(String s) {

        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i += 2){
            ans.append(s.charAt(i));
            if(i + 1 < s.length()){
                int val = s.charAt(i + 1) - '0';
                ans.append((char)(s.charAt(i) + val));
            }
        }

        return ans.toString();
    }
}
