class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int Lcount = 0; int Rcount = 0;
        for(int i = 0; i < moves.length(); i++){
            char ch = moves.charAt(i);
            if(ch == 'L'){
                Lcount++;
            }
            if(ch == 'R'){
                Rcount++;
            }
        }

        StringBuilder str = new StringBuilder();
        if(Lcount >= Rcount){
            for(int i = 0; i < moves.length(); i++){
                if(moves.charAt(i) == '_'){
                    str.append('L');
                }else{
                    str.append(moves.charAt(i));
                }
            }
        }else{
            for(int i = 0; i < moves.length(); i++){
                if(moves.charAt(i) == '_'){
                    str.append('R');
                }else{
                    str.append(moves.charAt(i));
                }
            }
        }

        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'L'){
                ans--;
            }else{
                ans++;
            }
        }

        return Math.abs(ans);
    }
}
