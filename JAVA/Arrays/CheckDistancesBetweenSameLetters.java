class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch - 'a'] == 0){
                arr[ch - 'a'] = i + 1;
            }else{
                if(i - arr[ch - 'a'] != distance[ch - 'a']){
                    return false;
                }
            }
        }

        return true;
    }
}
