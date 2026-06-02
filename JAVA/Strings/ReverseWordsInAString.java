class Solution {
    public String reverseWords(String s) {
        String ans = "";
        int i = 0;
        while(i < s.length()){
            while(i < s.length() && s.charAt(i) == ' '){
                i++;
            }
            int j = i;
            while(j < s.length() && s.charAt(j) != ' '){
                j++;
            }
            ans = s.substring(i, j) + ans;
            ans = " " + ans;
            i = j; i++; j++;
        }

        int k = 0;
        while(k < ans.length() && ans.charAt(k) == ' '){
            k++;
        }
        return ans.substring(k);
    }
}
