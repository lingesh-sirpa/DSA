class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        int prev = -1;
        int j = 0;
        while(j < s.length() && s.charAt(j) != c){
            j++;
        }
        for(int i = 0; i < s.length(); i++){
            if(prev == -1){
               ans[i] = Math.abs(i - j);
            }else{
               ans[i] = Math.min(Math.abs(i - prev), Math.abs(i - j));
            }
            if(i == j){
                prev = j;
                j++;
                while(j < s.length() && s.charAt(j) != c){
                    j++;
                }
                if(j == s.length()){
                    j = 0;
                }
            }
        }

        return ans;
    }
}
