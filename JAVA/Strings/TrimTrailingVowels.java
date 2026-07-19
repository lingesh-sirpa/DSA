class Solution {
    public String trimTrailingVowels(String s) {
        int j = s.length() - 1;
        while(j >= 0){
            char ch = s.charAt(j);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                j--;
            }else{
                break;
            }
        }

        return s.substring(0, j + 1);
    }
}
