class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> map = new HashSet<>();
        
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                char chU = (char)(ch - 32);
                if(!map.contains(ch) && map.contains(chU)){
                    count++;
                    map.add(ch);
                }else{
                    map.add(ch);
                }
            }else{
                char chL = (char)(ch + 32);
                if(!map.contains(ch) && map.contains(chL)){
                    count++;
                    map.add(ch);
                }else{
                    map.add(ch);
                }
            }
        }

        return count;
    }
}
