class Solution {
    public String smallestSubsequence(String s) {

        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        boolean[] vis = new boolean[26];
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
           char ch = s.charAt(i);
           if(!vis[ch - 'a']){
                while(ans.length() > 0 && ans.charAt(ans.length() - 1) > ch){
                   if(freq[ans.charAt(ans.length() - 1) - 'a'] > 0){
                      vis[ans.charAt(ans.length() - 1) - 'a'] = false;
                      ans.deleteCharAt(ans.length() - 1);
                   }
                   else{
                     break;
                   }
                }

                vis[ch - 'a'] = true;
                ans.append(ch);
            }
               
            freq[ch - 'a']--;
        }
        return ans.toString();
    }
}
