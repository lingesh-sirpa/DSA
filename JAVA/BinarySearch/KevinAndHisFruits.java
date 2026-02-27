import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            arr.add(sc.nextInt());
        }
        int ans = Solution.getMaxMarker(arr, n, m);
        System.out.println(ans);
    }
}
class Solution 
{   static int isPossible(ArrayList<Integer> arr, int mid){
       int fe = 0;
       for(int j=0; j<arr.size(); j++){
         if(arr.get(j) > mid){
           int count = arr.get(j)-mid;
           fe += count;;
         }
       }
       return fe;
    }

    static int getMaxMarker(ArrayList<Integer> arr, int n, int m) 
    {   int lo = 1; int ans = -1;
        int hi = Integer.MIN_VALUE;
       for(int i=0; i<arr.size(); i++){
         hi = Math.max(hi,arr.get(i));
       }
       while(lo <= hi){
         int mid = lo+(hi-lo)/2;
         int c = isPossible(arr,mid);
         if(c >= m){
            ans = mid;
            lo = mid+1;
         }
         else{
            hi = mid-1;
         }
       }
       return ans;
} }
