class Solution {
    public int maxSubstrings(String word) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(map.containsKey(ch)){
               if(i - map.get(ch) + 1 > 3){
                  count++;
                  map.clear();
               }
               continue;
            }
            map.put(ch, i);
        }

        return count;

    }
}
