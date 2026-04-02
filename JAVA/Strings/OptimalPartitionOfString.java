class Solution {
    public int partitionString(String s) {
        if(s.length() == 1){
            return 1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        int numOfSS = 0;
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) == 2){
              numOfSS++;
              map = new HashMap<>();
              continue;
            }
            i++;
        }
        numOfSS++;
        
        return numOfSS;
    }
}
