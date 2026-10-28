class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int j = 0; int i = 0;
        while(i < s.length() && j < words.length){
            String sb = words[j];
            int len = i + sb.length();
            if(len - 1 >= s.length() || !s.substring(i, len).equals(sb)){
                 return false;
            }
            i = len;
            j++;
        }
         
        if(i < s.length()){
            return false;
        }
        return true;
    }
}
