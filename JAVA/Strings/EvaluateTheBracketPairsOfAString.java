class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {

        HashMap<String, String> map = new HashMap<>();
        for(List<String> i : knowledge){
            map.put(i.get(0), i.get(1));
        }

        int stidx = -1;
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stidx = i + 1;
            }
            if(stidx == -1){
                ans.append(ch);
            }
            if(ch == ')'){
                if(map.containsKey(s.substring(stidx, i))){
                    ans.append(map.get(s.substring(stidx, i)));
                }else{
                    ans.append('?');
                }
                stidx = -1;
            }
        }

        return ans.toString();
    }
}
