class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i) - 'a']++;
        }
        Arrays.sort(freq);
        int pressButton = 1;
        int keys = 0;
        int ans = 0;
        for(int i = freq.length - 1; i >= 0; i--){
           if(freq[i] != 0){
              ans += freq[i] * pressButton;
              keys++;
              if(keys == 8){
                pressButton++;
                keys = 0;
              }
           }
        }

        return ans;
    }
}
