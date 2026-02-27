import java.io.*;
import java.util.*;
import java.util.*;

class Solution{

    public static boolean isPossible(int[] arr, int gap, int k){
	  int c=1; int prevCowIndex = 0;
	  for(int i=1; i<arr.length; i++){
		if(arr[i] - arr[prevCowIndex] >= gap){
			c++;
			prevCowIndex = i;
		}
	  }
	  return c >= k;
	}

    public static int aggressiveCows(int a[],int cows){
	  Arrays.sort(a);
	  int minGap = Integer.MAX_VALUE;
	  for(int i=0; i<a.length-1; i++){
        minGap = Math.min(minGap, a[i]-a[i+1]);
	  }

	  int lo = minGap;
	  int hi = a[a.length-1] - a[0];
      int ans = -1;
	  while(lo <= hi){
		int mid = lo+(hi-lo)/2;
		if(isPossible(a,mid,cows)){
           ans = mid;
		   lo = mid+1;
		}
		else{
           hi = mid-1;
		}
	  }
    return ans;
} }

class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution obj=new Solution();
		System.out.println(obj.aggressiveCows(nums,k));

    }
}
