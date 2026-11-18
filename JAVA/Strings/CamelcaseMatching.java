class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for(String s : queries){
            int i = 0;
            int j = 0;
            int val = -1;
            while(i < pattern.length()){
               char chi = pattern.charAt(i);
               int check = -1;
               while(j < s.length()){
                  char chj = s.charAt(j);
                  if((chi >= 'A' && chi <= 'Z') && (chj >= 'A' && chj <= 'Z') && chi != chj){
                       val = 0;
                       break;
                  }
                  if(chi == chj){
                     check = 0;
                     j++;
                     break;
                  }
                  j++;
               }
               if(check == -1){
                 val = 0;
                 break;
               }
               i++;
            }

            while(j < s.length()){
                char chj = s.charAt(j);
                if(chj >= 'A' && chj <= 'Z'){
                    val = 0;
                    break;
                }
                j++;
            }


            if(val == -1){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}
