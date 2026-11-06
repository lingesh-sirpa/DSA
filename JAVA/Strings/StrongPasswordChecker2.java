class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length() < 8){
            return false;
        }
        int lch = 0;
        int uch = 0;
        int digit = 0;
        int spch = 0;
        for(int i = 0; i < password.length(); i++){
            if(i > 0 && password.charAt(i) == password.charAt(i - 1)){
                return false;
            }
            char ch = password.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
               uch++;
            }else if(ch >= 'a' && ch <= 'z'){
                lch++;
            }else if(ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+'){
                spch++;
            }else if((ch - '0') >= 0 && (ch - '0') <= 9){
                digit++;
            }
        }
        
        if(lch < 1 || uch < 1 || digit < 1 || spch < 1){
            return false;
        }
        return true;
    }
}
