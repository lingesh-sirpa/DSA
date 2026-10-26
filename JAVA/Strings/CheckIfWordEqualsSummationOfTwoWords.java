class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int fWVal = 0;
        for(int i = 0; i < firstWord.length(); i++){
            int val = firstWord.charAt(i) - 'a';
            fWVal = fWVal * 10 + val;
        }

        int sWVal = 0;
        for(int i = 0; i < secondWord.length(); i++){
            int val = secondWord.charAt(i) - 'a';
            sWVal = sWVal * 10 + val;
        }

        int tVal = 0;
        for(int i = 0; i < targetWord.length(); i++){
            int val = targetWord.charAt(i) - 'a';
            tVal = tVal * 10 + val;
        }

        return (fWVal + sWVal) == tVal;
    }
}
