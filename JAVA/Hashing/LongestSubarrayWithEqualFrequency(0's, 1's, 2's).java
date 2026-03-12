import java.util.*;

class Solution{
    public static int longestSubarray(int[] arr){
      HashMap<String, Integer> map = new HashMap<>();
      map.put(0+"#"+0,-1);
      int i=0; int maxLen = 0;
      int c0 = 0; int c1 = 0; int c2 = 0;
      while(i < arr.length){
        if(arr[i] == 0){
           c0++;
        }else if(arr[i] == 1){
            c1++;
        }else if(arr[i] == 2){
            c2++;
        }
        int d1 = c1-c0; 
        int d2 = c2-c1;
        String key = d1+"#"+d2;
        if(map.containsKey(key)){
         int len = i-map.get(key);
         maxLen = Math.max(len, maxLen);
        }else{
        map.put(key, i);
        }
        i++;
      }
      return maxLen;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj =  new Solution();
        System.out.println(Obj.longestSubarray(arr));
    }
}
