class Solution {
    public int maximumLengthSubstring(String s) {

        HashMap<Character, Integer> freq = new HashMap<>();
        int maxlen = 0;
        int i = 0; int j = 0;
        while(j < s.length()){
            char chj = s.charAt(j);
            freq.put(chj, freq.getOrDefault(chj, 0) + 1);
            while(freq.get(chj) > 2){
                char chi = s.charAt(i);
                freq.put(chi, freq.get(chi) - 1);
                if(freq.get(chi) == 0){
                    freq.remove(chi);
                }
                i++;
            }
            maxlen = Math.max(maxlen, j - i + 1);
            j++;
        }


        return maxlen;
    }
}
