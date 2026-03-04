import java.util.*;

public class Main {
    public static int findIndex(int key, int[] arr) {
        int l=0; int r=arr.length-1;
        while(l <= r){
          int mid = l+(r-l)/2;
          if(arr[mid] == key){
            return mid;
          }
          else if(arr[mid] < key){
            l = mid+1;
          }
          else{
            r = mid-1;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, key;
        n = sc.nextInt();
        key = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(findIndex(key, arr));
        sc.close();
    }
}
