class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                map.put(ch, i);
            }
        }

        boolean[] check = new boolean[26];
        boolean[] vis = new boolean[26];
        for(int j = 0; j < word.length(); j++){
            char ch = word.charAt(j);
            if(ch >= 'A' && ch <= 'Z'){
                char chL = (char)(ch + 32);
                int idx = -1;
                if(map.containsKey(chL)){
                    idx = map.get(chL);
                }
                if(idx != -1 && idx > j){
                    check[ch - 'A'] = true;
                }
                if(check[ch - 'A'] == false && vis[ch - 'A'] == false && idx != -1 && idx < j){
                    vis[ch - 'A'] = true;
                    count++;
                }
            }
        }

        return count;
    }
}
