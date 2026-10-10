class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int val = coordinates.charAt(1) - '0';
        if(ch == 'a' || ch == 'c' || ch == 'e' || ch == 'g'){
           if(val % 2 != 0){
              return false;
           }
              return true;
        }

        if(val % 2 != 0){
            return true;
        }

        return false;
        
    }
}
