import java.util.*;

class Solution {
    static int count1(int size, int arr[]) {
        int i=0; int j=arr.length-1;
        int c = 0;
        while(i <= j){
          int mid = i+(j-i)/2;
           if(arr[mid] == 1){
              c = mid+1;
              i = mid + 1;
           }
           else{
              j = mid - 1;
           }
        }
        return c;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[] = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.count1(n,array));
    }
}
