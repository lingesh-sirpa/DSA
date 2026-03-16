import java.util.*;

class Solution {
   static boolean areAnagram(String c1, String c2) {
       char[] st1 = c1.toCharArray();
       Arrays.sort(st1);
       char[] st2 = c2.toCharArray();
       Arrays.sort(st2);

       if(st1.length != st2.length){
        return false;
       }
       
       HashSet<Character> map = new HashSet<>();
       for(int k=0; k<st1.length; k++){
        map.add(st1[k]);
       }

       for(int k=0; k<st2.length; k++){
        if(! map.contains(st2[k])){
            return false;
        }
       }
       
       return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
