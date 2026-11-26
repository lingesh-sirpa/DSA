class Solution {
    public boolean canAliceWin(int n) {
        if(n < 10){
            return false;
        }
        n = n - 10;
        int check = -1;
        int rem = 9;
        while(n >= 0){
            if(n < rem && check == -1){
                return true;
            }
           n = n - rem;
           rem--;
           if(check == -1){
             check = 0;
           }else{
             check = -1;
           }
        }

        return false;
    }
}
