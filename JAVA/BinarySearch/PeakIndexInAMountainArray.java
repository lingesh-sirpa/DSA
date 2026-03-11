import java.io.*;
import java.util.*;

class Solution {
    public int peakIndexInMountainArray(int[] A) {
       int i=0; int j=A.length-1; int mid=0;
       while(i <= j){
          mid = i+(j-i)/2;
         int prevVal = mid-1 >= 0 ? A[mid-1] : Integer.MIN_VALUE;
         int nextVal = mid+1 < A.length ? A[mid+1] : Integer.MIN_VALUE;
          if(prevVal < A[mid] && A[mid] > nextVal){
             return mid;
          }
          else if(prevVal < A[mid] && A[mid] < nextVal){
            i = mid+1;
          }
          else{
            j = mid-1;
          }
       }
       return -1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        Solution Obj = new Solution();
        int result = Obj.peakIndexInMountainArray(arr1);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}
