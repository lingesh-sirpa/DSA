import java.util.*;
import java.io.*;
class Solution
{   
    static boolean isPossibleMinPenalty(int[] arr, int maxOps, int num){
      int j=0; int reqSplits = 0;
      while(j < arr.length){
         reqSplits += (arr[j]-1)/num;
         j++;
      }
      return reqSplits <= maxOps;
    }

    public static int solve(int n,int m,int arr[])
    {
       int lo = 1;
       int hi = Integer.MIN_VALUE;
       for(int i=0; i<arr.length; i++){
        hi = Math.max(hi,arr[i]);
       }
       int ans = -1;
       while(lo <= hi){
         int mid = lo+(hi-lo)/2;
         if(isPossibleMinPenalty(arr,m,mid)){
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
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), m = input.nextInt();
        int[] arr;
        arr= new int[n];
        for(int i = 0; i < n; i++)arr[i]=input.nextInt();
        System.out.println(Solution.solve(n,m,arr));
    }
}
