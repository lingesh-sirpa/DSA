class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int i = 0; int j = 1;
        while(i < s.length()){
            char chi = s.charAt(i);
            char chj = 'A';
            int check = -1;
            if(j < s.length()){
                chj = s.charAt(j);
            }
            if(chi == 'M'){
              ans += 1000;
              check = 1;
            }else if(chi == 'D'){
              ans += 500;
              check = 1;
            }else if(chi == 'C' && chj == 'M'){
                ans += (1000 - 100);
            }else if(chi == 'C' && chj == 'D'){
                ans += (500 - 100);
            }else if(chi == 'C'){
                ans += 100;
                check = 1;
            }else if(chi == 'L'){
                ans += 50;
                check = 1;
            }else if(chi == 'X' && chj == 'C'){
                ans += (100 - 10);
            }else if(chi == 'X' && chj == 'L'){
                ans += (50 - 10);
            }else if(chi == 'X'){
                ans += 10;
                check = 1;
            }else if(chi == 'V'){
                ans += 5;
                check = 1;
            }else if(chi == 'I' && chj == 'X'){
                ans += (10 - 1);
            }else if(chi == 'I' && chj == 'V'){
                ans += (5 - 1);;
            }else if(chi == 'I'){
                ans += 1;
                check = 1;
            }

            if(check == 1){
                i = i + 1;
                j = j + 1;
            }else{
                i = i + 2;
                j = j + 2;
            }
        }

        return ans;
    }
}
