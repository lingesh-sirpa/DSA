class Solution {
    public String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            int prev = -1;
            String s = words[i];
            boolean flag = true;
            for(int j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                if(ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch - 'A' + 97);
                }
                if(ch == 'q' || ch == 'w' || ch == 'e' || ch == 'r' || ch == 't' || ch == 'y' || ch == 'u' || ch == 'i' || ch == 'o' || ch == 'p'){
                    if(prev != -1 && prev != 1){
                       flag = false;
                       break;
                    }
                    prev = 1;
                }else if(ch == 'a' || ch == 's' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k' || ch == 'l'){
                    if(prev != -1 && prev != 2){
                        flag = false;
                        break;
                    }
                    prev = 2;
                }else{
                    if(prev != -1 && prev != 3){
                        flag = false;
                        break;
                    }
                    prev = 3;
                }
            }

            if(flag){
                ans.add(s);
            }
        }

        String[] fans = new String[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            fans[i] = ans.get(i);
        }

        return fans;

    }
}
