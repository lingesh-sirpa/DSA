class Solution {
    public int rearrangeCharacters(String s, String target) {
        
        int[] sarr = new int[26];
        int[] tarr = new int[26];
        for(int i = 0; i < s.length(); i++){
            sarr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < target.length(); i++){
            tarr[target.charAt(i) - 'a']++;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < target.length(); i++){
            char ch = target.charAt(i);
            ans = Math.min(sarr[ch - 'a'] / tarr[ch - 'a'], ans);
        }

        return ans;
    }
}
