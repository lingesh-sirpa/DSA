import java.util.*;

class Main{
	public static void main(String[] args){
		try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();
			while(t>0){
				int n=sc.nextInt();
				int []A=new int[n];
				int m=sc.nextInt();
				int k=sc.nextInt();
				for(int i=0;i<n;i++){
					A[i]=sc.nextInt();
				}
				Solution ob =new Solution();
				int ans = ob.minDays(A,n,m,k);
				System.out.println(ans);
				t--;
			}
		}
	}

}
class Solution {
	public boolean isPossibleToMakeCakes(int[] arr, int m, int k, int days){
        int cakes = 0; int c = 0;
		int j=0;
		while(j < arr.length){
			if(arr[j] <= days){
				c++;
			}else{
				c = 0;
			}
			if(c == k){
				cakes++;
				c = 0;
			}
			j++;
		}
		return cakes >= m;
	}

    public int minDays(int[] bloomDay,int n, int m, int k) {
		if(m == 0){
			return 0;
		}
		if(m*k > n){
			return -1;
		}
		int lo = Integer.MAX_VALUE;
		int hi = Integer.MIN_VALUE;
		for(int i=0; i<bloomDay.length; i++){
			lo = Math.min(lo,bloomDay[i]);
			hi = Math.max(hi,bloomDay[i]);
		}
		int ans = -1;
		while(lo <= hi){
         int mid = lo+(hi-lo)/2;
		  if(isPossibleToMakeCakes(bloomDay,m,k,mid)){
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
