import java.io.*;
import java.util.*;

class Solution {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int ans = -1;
      for(int i : nums){
          map.put(i, map.getOrDefault(i,0) + 1);
          if(map.get(i) == k){
            ans = i;
            break;
         }
      } 
      System.out.println(ans);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);  
        System.out.println();
    }
}
