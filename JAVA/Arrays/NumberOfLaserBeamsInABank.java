class Solution {
    public int numberOfBeams(String[] bank) {
        
        int laserbeams = 0;
        int prerowcount = 0;
        for(int i = 0; i < bank.length; i++){
            String str = bank[i];
            int currowcount = 0;
            for(int k = 0; k < str.length(); k++){
                int ones = str.charAt(k) - '0';
                if(ones == 1){
                    currowcount++;
                }
            }
            if(prerowcount == 0){
                prerowcount = currowcount;
                continue;
            }
            if(prerowcount != 0 && currowcount > 0){
              laserbeams += prerowcount * currowcount;
              prerowcount = currowcount;
            }
        }
        return laserbeams;
    }
}
