import java.io.*;
import java.util.*;

public class Main {

    public static int searchInsert(int[] a, int b) {
      int l=0; int r = a.length-1;
      while(l <= r){
        int mid = l+(r-l)/2;
         if(a[mid] == b){
          return mid;
         }
         else if(a[mid] < b){
          l = mid+1;
         }
         else{
          r = mid-1;
         }
      }
      return l;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(searchInsert(A,B));
    }
}
