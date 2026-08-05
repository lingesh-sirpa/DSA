class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int ans = 0;
        int middle = 0;
        for(char ch : map.keySet()){
           if(map.get(ch) % 2 != 0){
             middle = 1;
           }
           if(map.get(ch) % 2 == 0){
             ans += map.get(ch);
           }else{
             ans += map.get(ch) - 1;
           }
        }
        ans += middle;
        return ans;
    }

}
