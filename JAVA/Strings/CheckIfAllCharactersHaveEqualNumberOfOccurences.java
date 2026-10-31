class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        
        int prev = -1;
        for(int i = 0; i < count.length; i++){
            if(prev != -1 && count[i] != 0 && prev != count[i]){
                return false;
            }
            if(count[i] != 0){
                prev = count[i];
            }
        }

        return true;
    }
}
