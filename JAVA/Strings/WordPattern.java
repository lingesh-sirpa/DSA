class Solution {

    public boolean countLW(String pattern, String s){
        int count = 1;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == ' '){
               count++;
            }
            i++;
        }
        return count == pattern.length();
    }
    public boolean wordPattern(String pattern, String s) {

        if(!countLW(pattern, s)){
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        int i = 0; int j = 0;
        for(int k = 0; k < pattern.length(); k++){
            char chk = pattern.charAt(k);
            while(j < s.length() && s.charAt(j) != ' '){
                 j++;
            }
            if(map.containsKey(chk) && !map.get(chk).equals(s.substring(i, j))){
                   return false;
            }
            if(!map.containsKey(chk)){
                for(char ch : map.keySet()){
                    if(map.get(ch).equals(s.substring(i, j))){
                        return false;
                    }
                }
            }
            map.put(chk, s.substring(i, j));
            j++;
            i = j;
        }
        
        return true;
    }
}
