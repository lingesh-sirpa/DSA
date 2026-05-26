class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = strs[0];
        int len = strs[0].length();
        for(int i = 1; i < strs.length; i++){
            if(strs[i].length() < len){
                s = strs[i];
                len = strs[i].length();
            }
        }

        String ans = "";
        boolean flag = true;
        int i = 0;
        while(i < s.length()){
            char chi = s.charAt(i);
            for(int j = 0; j < strs.length; j++){
                char chj = strs[j].charAt(i);
                if(chi != chj){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                ans = ans + chi;
                i++;
            }else{
                break;
            }
        }

        return ans;
    }
}
