import java.util.*;

class Solution {
    public int longestSubstring(String s) {
    
    int ans = 0;
    HashSet<Character> map = new HashSet<>();
    int i=0; int j=0;
    while(j < s.length()){
     char chj = s.charAt(j);
     if(map.contains(chj)){
       int len = j-i;
       if(len > ans){
        ans = len;
       }
       char chi = s.charAt(i);
       map.remove(chi);
       i++;
     }else{
        map.add(chj);
        j++;
     }
    }

    int len = j-i;
    if(len > ans){
        ans = len;
    }

    return ans;
    }
}

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        Solution ob = new Solution();
        int ans=ob.longestSubstring(s);
        System.out.println(ans);
    }
}
