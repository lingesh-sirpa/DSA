class Solution {
    public int minChanges(String s) {
        int count = 2; 
        int ans = 0;
        char ch = '\0';
        for(int i = 0; i < s.length(); i++){
            if(count == 2){
               ch = s.charAt(i); 
            }
            if(count == 1 && ch != s.charAt(i)){
                ans++;
            }
            count--;
            if(count == 0){
                count = 2;
            }
        }

        return ans;
    }
}
