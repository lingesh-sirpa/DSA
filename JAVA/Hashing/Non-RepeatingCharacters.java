import java.io.*;
import java.util.*;

class Solution {
    public void nonRepeatingCharacter(String s) {
     HashMap<Character, Integer> map = new HashMap<>();
     
     for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
     }
     
     char ans = '\0'; boolean flag = false;
     for(int j=0; j<s.length(); j++){
        int val = map.get(s.charAt(j));
        if(val == 1){
          flag = true;
          ans = s.charAt(j);
          break;
        }
     }

     if(flag == true){
        System.out.print(ans);
     } 
     else{
        System.out.print("-1");
     }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);  
        System.out.println();
    }
}
