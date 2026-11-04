class Solution {
    public boolean checkRecord(String s) {
        int abs = 0;
        int prev = -1;
        int lates = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A'){
                abs++;
                prev = -1;
                lates = 0;
            }else if(ch == 'L'){
                if(prev == -1){
                    lates++;
                }else if(prev != -1 && prev + 1 == i){
                    lates++;
                }
                prev = i;
            }else{
                prev = -1;
                lates = 0;
            }

            if(abs == 2){
                return false;
            }
            if(lates == 3){
                return false;
            }
        }

        return true;
    }
}
