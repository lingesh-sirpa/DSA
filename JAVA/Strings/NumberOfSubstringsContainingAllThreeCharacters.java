class Solution {
    public int numberOfSubstrings(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0; int len = s.length();

        int i = 0; int j = 0;
        while(j < s.length()){
           map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
             while(map.size() == 3){
                count += len - j;
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0){
                    map.remove(s.charAt(i));
                }
                i++;
             }
             j++;
        }

        return count;

    }
}
