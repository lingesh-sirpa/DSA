import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
    public static boolean isPossibleToShift(int[] arr, int days, long capacity){
     long cap = 0; long d = 1;
     int j=0;
     while(j < arr.length){
         if(cap + arr[j] <= capacity){
            cap += arr[j];
            j++;
         }
         else{
            d++;
            cap = 0;
         }
     }
     return d <= days;
    }
    public static long solve(int[] A, int B) {
      long lo = Integer.MIN_VALUE;
      long hi = 0;
      for(int i=0; i<A.length; i++){
        lo = Math.max(lo,A[i]);
        hi += A[i];
      }  
      long ans = -1;
      while(lo <= hi){
        long mid = lo+(hi-lo)/2;
        if(isPossibleToShift(A,B,mid)){
           ans = mid;
           hi = mid-1;
        }
        else{
           lo = mid+1;
        }
      } 
      return ans;   
    }
}

class Main {
        public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
        	int n = sc.nextInt();
        	int[] A = new int[n];
        	for(int i=0;i<n;i++){
                        A[i] = sc.nextInt();
		}
                int B = sc.nextInt();
                System.out.println(Solution.solve(A,B));
	}
}
