import java.util.*;
import java.io.*;

public class Main {
    static int floorInSortedArray(int[] arr, int x){
        int i=0; int j=arr.length-1; int ans = -1;
        while(i < j){
            int mid = i+(j-i)/2;
            if(arr[mid] <= x){
                ans = mid;
                i = mid+1;
            }
            else{
                j = mid;
            }
        }
        return ans;
    }
    
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     int x = sc.nextInt();
     int[] arr = new int[n];
     for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
     }
     int res = floorInSortedArray(arr,x);
     System.out.print(res);
    }
}
