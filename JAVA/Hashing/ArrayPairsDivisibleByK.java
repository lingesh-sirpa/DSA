import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		 
      HashMap<Integer, Integer> map = new HashMap<>();
      for(int i = 0; i < arr.length; i++){
        int rem = (arr[i]%k + k) % k;
        map.put(rem, map.getOrDefault(rem, 0) + 1);
      }

      for(int r : map.keySet()){
        if(r == 0){
           if(map.get(r)%2 != 0){
            return false;
           }
        }
        else if(k%2 == 0 && r == k/2){
          if(map.get(r)%2 != 0){
            return false;
          }
        }
        else{
           int val1 = map.get(r);
           int val2 = map.getOrDefault(k-r, 0);
           if(val1 != val2){
            return false;
           }
        }
      }
      
      return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}
