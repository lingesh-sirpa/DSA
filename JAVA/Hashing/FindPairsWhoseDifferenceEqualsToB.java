import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []A, int n, int B) {
        Arrays.sort(A);
        HashSet<Integer> map = new HashSet<>();
        int j = 0; int ans = 0;
        while(j < A.length){
          int sum = A[j]+B;
          if(map.contains(A[j])){
            return 1;
          }
          map.add(sum);
          j++;
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
