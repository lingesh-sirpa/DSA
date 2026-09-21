class Solution {
    public int maxProduct(String[] words) {
        int[] arr = new int[26];
        int ans = 0;
        for(int i = 0; i < words.length; i++){
            String s1 = words[i];
            for(int j = 0; j < s1.length(); j++){
                arr[s1.charAt(j) - 'a']++;
            }
            for(int k = i + 1; k < words.length; k++){
               String s2 = words[k];
               if(s1.length() * s2.length() <= ans){
                 continue;
               }
               boolean flag = true;
               for(int l = 0; l < s2.length(); l++){
                  if(arr[s2.charAt(l) - 'a'] > 0){
                    flag = false;
                    break;
                  }
               }

               if(flag){
                  ans = Math.max(ans, s1.length() * s2.length());
               }
            }

            arr = new int[26];
        }

        return ans;
    }
}
