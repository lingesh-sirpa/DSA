class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() < t.length() || s.length() > t.length()){
            return false;
        }
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr); 
        Arrays.sort(tarr);
        int i = 0;
        while(i < sarr.length){
            if(sarr[i] != tarr[i]){
                return false;
            }
            i++;
        }

        return true;
    }
}
