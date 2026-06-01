class Solution {
    public int lengthOfLastWord(String s) {
        int lenOfLastWord = 0;
        int j = s.length() - 1;
        while(j >= 0 && s.charAt(j) == ' '){
            j--;
        }
        while(j >= 0){
           char ch = s.charAt(j);
           if(ch == ' '){
             break;
           }
           lenOfLastWord++;
           j--;
        }
        return lenOfLastWord;
    }
}
