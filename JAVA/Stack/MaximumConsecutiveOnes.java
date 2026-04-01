import java.io.*;
import java.util.*;

class Solution{
     public static int maxConsecutiveOnes(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int maxones = 0;
        int count = 0;
        for(int i = 0; i < n; i++){
            st.push(arr[i]);
            if(arr[i] == 1){
                count++;
            }
            if(st.size() > 0 && st.peek() == 0){
                maxones = Math.max(maxones, count);
                count = 0;
            }
        }
        maxones = Math.max(maxones, count);
        return maxones;
}
}
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution obj = new Solution();
        System.out.println(obj.maxConsecutiveOnes(arr, n));
    }
}
