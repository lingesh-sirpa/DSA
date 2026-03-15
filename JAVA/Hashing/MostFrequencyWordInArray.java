import java.io.*;
import java.util.*;

class Solution {
    public void mostFrequent(String []arr, int n) {
       HashMap<String, Integer> map = new HashMap<>();
       for(int i=0; i<arr.length; i++){
        String st = arr[i];
        map.put(st, map.getOrDefault(st, 0) + 1);
       }
       
       int count = 0;
       String str = "";
       for(int j=0; j<arr.length; j++){
         int val = map.get(arr[j]);
         if(val >= count){
           count = val;
           str = arr[j];
         }
       }
       
       System.out.print(str);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
                arr[i] = sc.next();
        }
        Solution Obj = new Solution();
        Obj.mostFrequent(arr,n);  
        System.out.println('\n');
    }
}
