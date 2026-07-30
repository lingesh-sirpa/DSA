class Solution {
    public int minimumPushes(String word) {
        int press = 1;
        int count = 0;
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(map.containsKey(ch)){
                ans += map.get(ch);
            }else{
                map.put(ch, press);
                count++;
                if(count == 8){
                    count = 0;
                    press++;
                }
                ans += map.get(ch);
            }
        }

        return ans;
    }
}
