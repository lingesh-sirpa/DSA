import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class Solution {
    static int findEquilibriumIndex(int[] a) {
      int tsum = 0;
      for(int i=0; i<a.length; i++){
        tsum += a[i];
      }
      int j=0; int lsum=0;
      while(j < a.length){
        int rsum = tsum-lsum-a[j];
        if(lsum == rsum){
            return j;
        }
        lsum += a[j];
        j++;
      }
      return -1;
    }
}
