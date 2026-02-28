import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public boolean canWeAllocate(long threshold, int[] A, int B){
      int idx = 0;
      int counter = 1;
      int pageCounter = 0;
      while(idx < A.length){
        if(pageCounter + A[idx] <= threshold){
            pageCounter += A[idx];
            idx++;
        }
        else{
            counter++;
            pageCounter = 0;
        }
      }

      return counter <= B;
    }
    public long MinimumPages(int[] A, int B) {
      if(A.length < B){
        return -1;
      }
      long lo = Integer.MIN_VALUE;
      long hi = 0;
      int i = 0;
      while(i < A.length){
        lo = Math.max(lo,A[i]);
        hi = hi+A[i];
        i++;
      }

      if(B == 1){
        return hi;
      }
      long ans = -1;
      while(lo < hi){
        long mid = lo+(hi-lo)/2;
        boolean res = canWeAllocate(mid,A,B);
        if(res == true){
            ans = mid;
            hi = mid;
        }
        else{
            lo = mid+1;
        }
      }
      return ans;
    }
}

class Main {
    

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
	    
	    int N = sc.nextInt();
	    int B = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();

        Solution Obj = new Solution(); 
        System.out.println(Obj.MinimumPages(A,B));
	}
}
