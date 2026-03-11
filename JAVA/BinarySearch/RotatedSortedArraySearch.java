import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
  public static void main (String[] args)
	{
    Scanner sc = new Scanner(System.in);
	    
	  int N = sc.nextInt();
	  int[] A = new int[N];
	  for(int i=0;i<N;i++){
          A[i] = sc.nextInt();
      }
	  int B = sc.nextInt();
	  Solution ob = new Solution();
    System.out.println(ob.search(A,B));
		
	}
}

class Solution{
    public int search(final int[] a, int target) {
      int i=0; int j=a.length-1;
      while(i < j){
        int mid = i+(j-i)/2;
        if(a[mid] > a[j]){
          i = mid+1;
        }
        else{
          j = mid;
        }
      }
      
      if(a[i] <= target && target <= a[a.length-1]){
        j = a.length-1;
      }
      else{
        i = 0;
        j = j-1;
      }

      while(i <= j){
        int mid = i+(j-i)/2;
        if(a[mid] == target){
            return mid;
        }
        else if(a[mid] < target){
            i = mid+1;
        }
        else{
            j = mid-1;
        }
      }
      return -1;
    }
}
