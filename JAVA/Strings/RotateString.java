class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length() > s.length() || goal.length() < s.length()){
            return false;
        }
        
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            char chi = s.charAt(i);
            char chg = goal.charAt(i);
            if(chi == chg){
                c++;
            }
        }

        if(c == goal.length()){
            return true;
        }
        
        String rs = "";
        int i = 0;

        for(int j = 1; j < s.length(); j++){
            rs = s.substring(j) + s.substring(i,j);
            int count = 0;
            for(int k = 0; k < rs.length(); k++){
                char chrs = rs.charAt(k);
                char chg = goal.charAt(k);
                if(chrs != chg){
                    break;
                }else{
                    count++;
                }
            }

            if(count == goal.length()){
                return true;
            }
        }

       return false;
       
    }
}
