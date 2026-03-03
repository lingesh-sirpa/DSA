import java.util.HashMap;
import java.io.*;
import java.util.*;

class Solution {
   public int maxLen(int arr[])
	{    
	  HashMap<Integer,Integer> map = new HashMap<>();
	  int j = 0; int sum = 0; int len = 0;
      while(j < arr.length){
		sum += arr[j];
		if(sum == 0){
          len = j+1;
		}
		if(map.containsKey(sum)){
		  len = Math.max(len, j-map.get(sum));
		}
		else{
		  map.put(sum, j);
		}
		j++;
	  }
	  return len;
	}
}

class Main {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution Obj = new Solution();
		System.out.println(Obj.maxLen(nums));
	}
}
