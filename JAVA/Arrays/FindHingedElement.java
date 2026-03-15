import java.io.*;
import java.util.*;

class Solution {
    public int findElement(int[] arr, int n) {
	  
    if(arr.length == 1){
		return 0;
	  }

    int[] lle = new int[n];
	  int max = arr[0];
	  for(int i = 0; i < arr.length; i++){
		max = Math.max(max, arr[i]);
		lle[i] = max;
	  }

	  int[] rse = new int[n];
	  int min = arr[n-1];
	  for(int i = arr.length-1; i >= 0; i--){
          min = Math.min(min, arr[i]);
		  rse[i] = min;
	  }

	  int ans = -1;
	  for(int i = 0; i < arr.length; i++){
		if(i == 0 && arr[i] < rse[i+1]){
		   ans = 0;
		}
		else if(i > 0 && i < (n-1) && lle[i-1] < arr[i] && arr[i] < rse[i+1]){
			ans = i;
		}
		else if(i == (n-1) && lle[i-1] < arr[i]){
			ans = n-1;
		}
	  }
	  
	  return ans;
    }
}

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
	}
}
