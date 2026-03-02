class Solution {
    public String minWindow(String s, String t) {
      if(t.length() > s.length()){
        return "";
      }
      HashMap<Character, Integer> li = new HashMap<>();
      for(int i=0; i<t.length(); i++){
        char ch = t.charAt(i);
        if(li.containsKey(ch)){
            li.put(ch, li.get(ch) + 1);
        }
        else{
            li.put(ch, 1);
        }
      }
 
      int i=0; int j=0; int count = t.length();
      int st = -1; int en = -1; int min = Integer.MAX_VALUE;
      while(j < s.length()){
        char chj = s.charAt(j);
        if(li.containsKey(chj)){
            li.put(chj, li.get(chj) - 1);
            if(li.get(chj) >= 0){
                count--;
            }
        }
        if(count == 0){
            while(count == 0){
                int len = j - i + 1;
                if(len < min){
                    min = len;
                    st = i; en = j;
                }
                char chi = s.charAt(i);
                if(li.containsKey(chi)){
                    li.put(chi, li.get(chi) + 1);
                    if(li.get(chi) > 0){
                        count++;
                    }
                }
                i++;
            }
        }
        j++;
      }
      if(st == -1 && en == -1){
        return "";
      }
      return s.substring(st, en+1);
    }
}
